package com.gyc.netty;

import com.gyc.entity.User;
import com.gyc.service.UserService;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Sharable
public class ServerHandler extends ChannelInboundHandlerAdapter {
    @Resource
    private UserService userService;

    /**
     * 获取数据
     * @param ctx 上下文
     * @param msg 获取的数据
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
        ByteBuf readMessage= (ByteBuf) msg;
        System.out.println(readMessage.toString(CharsetUtil.UTF_8));
        List<User> users = userService.selectAll();
        users.forEach(user-> System.out.println(user.toString()));
    }
}

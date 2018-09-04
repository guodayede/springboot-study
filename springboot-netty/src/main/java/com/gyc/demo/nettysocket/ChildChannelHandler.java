package com.gyc.demo.nettysocket;


import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {
    @Resource
    private DiscardServerHandler discardServerHandler;

    public void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(discardServerHandler);
    }
}

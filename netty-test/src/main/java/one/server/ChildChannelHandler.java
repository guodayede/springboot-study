package one.server;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;

public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {

    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ByteBuf byteBuf= Unpooled.copiedBuffer("$".getBytes());
        socketChannel.pipeline().addLast(new DelimiterBasedFrameDecoder(1024,byteBuf));
        socketChannel.pipeline().addLast(new DiscardServerHandler());
    }
}

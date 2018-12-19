package com.zhkui.ulex.transport.Netty;

import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zhkui.ulex.common.Request;

public class NettyServiceHander extends SimpleChannelInboundHandler<Request> {

    Logger logger = LoggerFactory.getLogger(NettyServiceHander.class);

    public void channelRead0(ChannelHandlerContext ctx, Request msg) throws Exception {
        logger.debug("channelRead0");
    }
}
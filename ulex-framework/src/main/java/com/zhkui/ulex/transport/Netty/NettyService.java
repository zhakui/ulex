package com.zhkui.ulex.transport.Netty;

import com.zhkui.ulex.transport.AbstractService;
import com.zhkui.ulex.common.Endpoint;
import com.zhkui.ulex.core.ServiceRouter;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import net.openhft.affinity.AffinityStrategies;
import net.openhft.affinity.AffinityThreadFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NettyService extends AbstractService{

    Logger logger = LoggerFactory.getLogger(NettyService.class);

    private ServerBootstrap bootstrap = new ServerBootstrap();

    public NettyService(Endpoint endpoint, ServiceRouter serviceRouter){
        super(endpoint, serviceRouter);
        logger.info(NettyService.class.getName());
    }

    public void run(){
        logger.info("Netty service start...");
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        AffinityThreadFactory threadFactory = new AffinityThreadFactory("com.zhkui", AffinityStrategies.DIFFERENT_CORE);
        EventLoopGroup workGroup = new NioEventLoopGroup(Math.max(2, 2 * Runtime.getRuntime().availableProcessors()),threadFactory);
        try{
            
            bootstrap.group(bossGroup,workGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG,128)
                .childOption(ChannelOption.TCP_NODELAY,true)
                .childOption(ChannelOption.SO_KEEPALIVE,true)
                .handler(new LoggingHandler(LogLevel.INFO))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new NettyServiceHander());
                    }
                });
            bootstrap.bind(this.endpoint.getPort()).sync();
            isRunning.set(true);
        }
        catch(Exception exception){

        }
    }

    public boolean isRunning(){
        return isRunning.get();
    }

    public void stop(){}

}
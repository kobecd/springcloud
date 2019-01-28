package com.arc.ws.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @description:
 * @author: yechao
 * @date: 2019/1/26 23:08

 * ServerEndpoint
 * 使用springboot的唯一区别是要@Component声明下，而使用独立容器是由容器自己管理websocket的，但在springboot中连容器都是spring管理的。
 * 虽然@Component默认是单例模式的，但springboot还是会为每个websocket连接初始化一个bean，所以可以用一个静态set保存起来。
 */
@ServerEndpoint("/saleclue/call/{authorization}") //WebSocket客户端建立连接的地址
@Component
public class SocketServerEndpointS {

    private final static Logger logger = LoggerFactory.getLogger(SocketServerEndpointS.class);
    /**
     * 存活的session集合（使用线程安全的map保存）
     */
    public static Map<String, Session> livingSessions = new ConcurrentHashMap<>();

    /**
     * 建立连接的回调方法
     *
     * @param session       与客户端的WebSocket连接会话
     * @param authorization 用户信息token，WebSocket支持路径参数
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("authorization") String authorization) {
        String sessionId = session.getId();
        livingSessions.put(sessionId, session);
    }

    /**
     * 收到客户端消息的回调方法
     *
     * @param message 客户端传过来的消息
     * @param session 对应的session
     */
    @OnMessage
    public void onMessage(String message, Session session, @PathParam("authorization") String authorization) throws IOException {
        System.out.println(message);
        session.getBasicRemote().sendText("收到");
    }

    /**
     * 发生错误的回调方法
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        logger.info("socket 发生错误 error:{}", error.toString());
    }

    /**
     * 关闭连接的回调方法
     */
    @OnClose
    public void onClose(Session session, @PathParam("authorization") String authorization) {
        livingSessions.remove(session.getId());
    }

}

package com.kevin.consumer.websocket;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

/**
 *  WebSocket处理器
 *  @Author: Kevin Zhang @Date: 2020-12-9 10:03
**/
@Service
public class WebSocketHandler extends TextWebSocketHandler {
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        String textContent = message.getPayload();
        System.out.println("服务端收到消息：" + textContent);
        TextMessage textMessage = new TextMessage(textContent);
        session.sendMessage(textMessage);
    }
}

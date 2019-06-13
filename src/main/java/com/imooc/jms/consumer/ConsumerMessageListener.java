package com.imooc.jms.consumer;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ConsumerMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		try {
			System.out.println("接受消息：" + textMessage.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

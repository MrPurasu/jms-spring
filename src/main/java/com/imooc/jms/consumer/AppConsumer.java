package com.imooc.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
	}
	
}

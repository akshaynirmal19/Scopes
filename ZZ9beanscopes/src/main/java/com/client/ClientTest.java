package com.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =   new ClassPathXmlApplicationContext("Beans.xml");
		Message message = context.getBean("message",Message.class);
		
		message.setMessageId(1001);
		message.setMessage("Akshay");
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		Message message1 = context.getBean("message",Message.class);
		
		System.out.println(message1.getMessageId()+"\t"+message1.getMessage());

	}

}

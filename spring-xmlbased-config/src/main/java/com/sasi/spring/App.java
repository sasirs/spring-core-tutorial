package com.sasi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sasi.spring.service.MessageProcessor;
import com.sasi.spring.service.MessageProcessorImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		
		
		MessageProcessor userService = applicationContext.getBean(MessageProcessorImpl.class);
		userService.processMsg("");
		applicationContext.close();
	}
}

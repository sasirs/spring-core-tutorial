package com.sasi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sasi.spring.config.AppConfig;
import com.sasi.spring.service.MessageProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageProcessor  userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("twitter message sending ");
    }
}

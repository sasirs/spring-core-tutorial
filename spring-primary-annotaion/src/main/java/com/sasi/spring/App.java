package com.sasi.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sasi.spring.config.AppConfig;
import com.sasi.spring.service.MessageService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageService messageService = context.getBean(MessageService.class);
		messageService.sendMsg();
		context.close();
    }
}

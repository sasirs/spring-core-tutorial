package com.sasi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sasi.spring.config.AppConfig;
import com.sasi.spring.service.MessageProcessor;
import com.sasi.spring.service.MessageProcessorImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageProcessor ms = applicationContext.getBean(MessageProcessorImpl.class);
		ms.processMsg("SMS message sending ");
    }
}

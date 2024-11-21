package com.sasi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sasi.spring.config.AppConfig;
import com.sasi.spring.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.setName("sasi");
		
		System.out.println(userService.getName());
		
		
		UserService  userService1 = applicationContext.getBean(UserService.class);
		System.out.println(userService1.getName());
		
		

    }
}

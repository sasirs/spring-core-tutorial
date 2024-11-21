package com.sasi.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sasi.spring.lazy.AppConfig;
import com.sasi.spring.lazy.FirstBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		FirstBean fs =context.getBean(FirstBean.class);
		 
		fs.test();
		
		context.close();
    }
}

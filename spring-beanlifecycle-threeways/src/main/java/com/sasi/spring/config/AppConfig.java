/**
 * @author sasi
 *
 */
package com.sasi.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sasi.spring.service.EmailService;
import com.sasi.spring.service.MessageProcessor;
import com.sasi.spring.service.MessageProcessorImpl;
import com.sasi.spring.service.MessageService;
import com.sasi.spring.service.TwitterService;

/**
 * 
 */

@Configuration
@ComponentScan("com.sasi.spring")
 public class AppConfig {
	
	@Bean(name="emailService")
	public MessageService emailService(){
		return new EmailService();
	}
	
	@Bean(name="twitterService")
	public MessageService twitterService(){
		return new TwitterService();
	}
	 
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(emailService());
	}
 
}

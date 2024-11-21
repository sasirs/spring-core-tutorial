/**
 * @author sasi
 *
 */
package com.sasi.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sasi.spring.service.MessageProcessor;
import com.sasi.spring.service.MessageProcessorImpl;
import com.sasi.spring.service.MessageService;
import com.sasi.spring.service.TwitterService;

/**
 * 
 */

@Configuration
public class AppConfig2 {
	
	@Bean(name="twitterService")
	public MessageService twitterService(){
		return new TwitterService();
	}
	
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(twitterService());
	}
	
	
}

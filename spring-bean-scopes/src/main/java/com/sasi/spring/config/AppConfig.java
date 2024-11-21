/**
 * @author sasi
 *
 */
package com.sasi.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sasi.spring.service.UserService;

/**
 * 
 */

@Configuration
 public class AppConfig {
	
	@Bean
	@Scope("prototype")
	public UserService userService(){
		return new UserService();
	}
 
}

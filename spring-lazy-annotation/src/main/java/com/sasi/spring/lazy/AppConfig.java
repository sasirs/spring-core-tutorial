/**
 * @author sasi
 *
 */
package com.sasi.spring.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * 
 * 
 */
@Configuration
public class AppConfig {

	@Lazy(value = true)
	@Bean
	public FirstBean fistBean() {
		return new FirstBean();
	}
	
	@Bean
	public SecondBean secondBean() {
		return new SecondBean();
	}
}

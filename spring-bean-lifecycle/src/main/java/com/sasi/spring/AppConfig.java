/**
 * @author sasi
 *
 */
package com.sasi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 */

@Configuration
public class AppConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public DataBaseInitializer databaseInitiaizer() {
		return new DataBaseInitializer();
	}
}

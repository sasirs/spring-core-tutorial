/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FacebookMessageService implements MessageService {
	 

	@Override
	public void sendMsg() {
		System.out.println("FacebookMessageService implementation here");
		
	}
}
/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

import org.springframework.stereotype.Service;

/**
 * 
 */
@Service("SMSService")

public class SMSService implements MessageService{

	@Override
	public void sendMsg(String message) {
		System.out.println(message);
		
	}

}

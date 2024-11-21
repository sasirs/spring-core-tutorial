/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

import org.springframework.stereotype.Service;

/**
 * 
 */

@Service("TwitterService")

public class TwitterService implements MessageService{

	@Override
	public void sendMsg(String message) {
		System.out.println("Twitter "+message);		
	}

}

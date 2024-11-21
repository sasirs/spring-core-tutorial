/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

/**
 * 
 */
public class SMSService implements MessageService{

	@Override
	public void sendMsg(String message) {
		System.out.println(message);
		
	}

}

/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

/**
 * 
 */
public class EmailService implements MessageService{

	@Override
	public void sendMsg(String message) {
		System.out.println("Emamil ::"+message);		
	}
	
}

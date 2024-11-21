/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 
 */
public class MessageProcessorImpl implements MessageProcessor {

	private MessageService ms;
	  
	@Autowired 
	public MessageProcessorImpl(@Qualifier("EmailService") MessageService msr) {
		this.ms = msr;
	}

	 
	@Override
	public void processMsg(String message) {
		ms.sendMsg(message);
	}

}

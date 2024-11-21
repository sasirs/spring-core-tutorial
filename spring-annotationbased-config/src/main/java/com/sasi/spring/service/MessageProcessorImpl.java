/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class MessageProcessorImpl implements MessageProcessor {

	private MessageService ms;


	@Autowired
	@Qualifier("SMSService")
	public void setMs(MessageService msr) {
		this.ms = msr;
	}

	@Override
	public void processMsg(String message) {
		ms.sendMsg(message);
	}

}

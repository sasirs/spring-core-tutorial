/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

/**
 * 
 */
public class MessageProcessorImpl implements MessageProcessor {

	private MessageService ms;
	 
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public void setMs(MessageService msr) {
		this.ms = msr;
	}

	@Override
	public void processMsg(String message) {
		ms.sendMsg(this.msg);
	}

}

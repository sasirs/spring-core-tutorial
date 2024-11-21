/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Primary

@Component
public class EmailService  implements MessageService {

	@Override
	public void sendMsg() {
		System.out.println("EmailMessageService Implementation here");		
	}

}

/**
 * @author sasi
 *
 */
package com.sasi.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 */
public class FirstBean {

	 
	@Autowired
	SecondBean secondBean;
	

	@Autowired
	ThirdBean thirdBean;
	
	public FirstBean() {
		System.out.println("FirstBean Initialized via Constuctor");
	}
	
	
	public void populateBeans() {
        secondBean.display();
        thirdBean.display();
    }
}

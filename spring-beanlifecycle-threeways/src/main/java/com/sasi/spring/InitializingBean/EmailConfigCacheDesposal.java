/**
 * @author sasi
 *
 */
package com.sasi.spring.InitializingBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * 
 */

@Component
public class EmailConfigCacheDesposal implements DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

}

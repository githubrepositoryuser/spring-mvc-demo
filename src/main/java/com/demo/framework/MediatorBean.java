package com.demo.framework;

import org.apache.camel.Produce;
import org.springframework.stereotype.Component;

@Component ("mediatorBean")
public class MediatorBean {

	/** Proxy for empMain route */
	@Produce(uri = "direct:empMain")
	private EmployeeMediator mediatorProxy;
	
	/**
	 *  Gets mediator proxy
	 *  @return
	 */
	public EmployeeMediator getMediatorProxy() {
		return mediatorProxy;
	}
}

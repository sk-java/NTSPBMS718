package com.sk.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Lazy(true)
@Component("bluedart")
public class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return oid + " orderId items set for delivery using BlueDart Courier Service.";
	}

}

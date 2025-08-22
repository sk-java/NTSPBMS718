package com.sk.sbeans;

import org.springframework.stereotype.Component;

@Component("xpressbees")
public class XpressBees implements ICourier {
	
	public XpressBees() {
		System.out.println("XpressBees:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("XpressBees.deliver()");
		return oid + " orderId items are set for delivery using XpressBees Courier Service.";
	}

}

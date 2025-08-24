package com.sk.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier {

	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid + " orderId items set for delivery using DTDC Courier Service.";
	}

}

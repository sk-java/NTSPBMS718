package com.sk.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		
		return oid + " are out for delivery by DTDC.";
	}

}

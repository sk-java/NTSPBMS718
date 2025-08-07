package com.sk.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Courier {

	@Override
	public String deliver(int oid) {
		return oid + " are out for delivery by DHL.";
	}

}

package com.sk.factory;

import com.sk.comps.DHL;
import com.sk.comps.DTDC;
import com.sk.comps.ECommerceStore;
import com.sk.comps.ICourier;

public class ECommerceStoreFactory {

	public static ECommerceStore getInstance(String courierType) {
		ICourier courier = null;
		if (courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		} else if (courierType.equalsIgnoreCase("dhl")) {
			courier = new DHL();
		} else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		ECommerceStore store = new ECommerceStore();
		store.setCourier(courier);
		return store;
	}

}

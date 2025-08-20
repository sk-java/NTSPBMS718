package com.sk.comps;

import java.util.Arrays;
import java.util.Random;

public final class ECommerceStore {

	public ICourier courier;

	public ECommerceStore() {
		System.out.println("ECommerceStore:: 0-param constructor");
	}

	public void setCourier(ICourier courier) {
		System.out.println("ECommerceStore.setCourier()");
		this.courier = courier;
	}

	// business method
	public String shopping(String[] items, double[] prices) {
		System.out.println("ECommerceStore.shopping()");
		double billamt = 0;
		for (double p : prices) {
			billamt += p;
		}
		// generate the orderId
		int oid = new Random().nextInt(10000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + ":: are purchased having prices ::" + Arrays.toString(prices)
				+ " with bill amount::" + billamt + "--->" + msg;
	}

}

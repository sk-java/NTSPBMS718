package com.sk.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ecs")
public class ECommerceStore {

	@Autowired
	@Qualifier("dhl")
	private ICourier courier;

	public ECommerceStore() {
		System.out.println("ECommerceStore:: 0-param constructor");
	}

	public String shopping(String[] items, double[] prices) {
		System.out.println("ECommerceStore.shopping()");
		double billamt = 0;
		for (double p : prices) {
			billamt += p;
		}
		int oid = new Random().nextInt(10000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + ":: are purchased having prices ::" + Arrays.toString(prices)
				+ " with bill amount::" + billamt + "--->" + msg;
	}
}

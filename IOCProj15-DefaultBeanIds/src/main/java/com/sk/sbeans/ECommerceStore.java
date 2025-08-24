package com.sk.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ecs")
//@Component
//@Scope("singleton")
public final class ECommerceStore {
	@Autowired
	@Qualifier("bluedart")
	private ICourier courier;

	public ECommerceStore() {
		System.out.println("ECommerceStore:: 0-param constructor");
	}

	// business method
	public String shopping(String[] items, double[] prices) {
		System.out.println("ECommerceStore.shopping()");
		double billAmount = 0;
		for (double price : prices) {
			billAmount += price;
		}
		int oid = new Random().nextInt(10000);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + ":: are purchased having prices:: " + Arrays.toString(prices)
				+ " with bill amount:: " + billAmount + "::" + msg;
	}

}

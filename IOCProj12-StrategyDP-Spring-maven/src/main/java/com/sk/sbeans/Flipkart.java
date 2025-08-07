package com.sk.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Flipkart {
	@Autowired
	@Qualifier("dhl")
	private Courier courier; // HAS-A property

	// Business method
	public String shopping(String items[], double prices[]) {

		// claculate bill amount
		double billAmount = 0.0;
		for (double price : prices) {
			billAmount += price;
		}

		// generate order id
		int oid = new Random().nextInt(10000);
		// deliver products using courier
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " items with bill amount of RS." + billAmount + " with order ID: " + msg;
	}

}

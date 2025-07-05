package com.sk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.DiscountCalculator;

public class Test {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/applicationContext.xml");

		DiscountCalculator discount = (DiscountCalculator) ctx.getBean("dc");

		String wishMessage = discount.calculateDiscount();
		System.out.println(wishMessage);
	}

}

package com.sk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.WishMessageGenerator;

public class Test {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/applicationContext.xml");

		WishMessageGenerator generator = (WishMessageGenerator) ctx.getBean("wmg");

		String wishMessage = generator.generateWishMessage();
		System.out.println(wishMessage);
	}

}

package com.sk.main;

import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/applicationContext.xml");

		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;

		System.out.print("Enter your name : ");
		String wishMessage = generator.showWishMessage(sc.next());
		System.out.println(wishMessage);

	}

}

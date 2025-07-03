package com.sk.main;

import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.beans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/ApplicationContext.xml");

		Object obj = ctx.getBean("wmg");

		WishMessageGenerator generator = (WishMessageGenerator) obj;
		
		System.out.println("-------------------------------");
		System.out.println("Email: "+generator.getEmail());
		System.out.println("Age: "+generator.getAge());
		System.out.println("Today's Date: "+generator.getDate());
		System.out.println("Current Time: "+generator.getTime());
		System.out.println("-------------------------------");
		
		System.out.print("Enter your name : ");
		String wishMessage = generator.getWishMessage(sc.next());
		System.out.println(wishMessage);

		ctx.close();

	}

}

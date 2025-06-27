package com.sk.main;

import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.beans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/ApplicationContext.xml");

		WishMessageGenerator res = (WishMessageGenerator) ctx.getBean("wmg");

		System.out.print("Enter your name : ");
		System.out.println(res.getWishMessage(sc.next()));

	}

}

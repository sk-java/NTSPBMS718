package com.sk.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	// has-A properties
	private LocalTime time;
	private LocalDate date;
	// simple properties
	private int age;
	private String email;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constuctor");
	}

	public WishMessageGenerator(LocalTime time, LocalDate date, int age, String email) {
		System.out.println("WishMessageGenerator:: 4-param constructor");
		this.time = time;
		this.date = date;
		this.age = age;
		this.email = email;
	}

	public String showWishMessage(String user) {

		System.out.println(
				"WishMessageGenerator.showWishMessage():" + time + " :: " + date + " :: " + age + " :: " + email);

		int hour = time.getHour();
		if (hour < 12) {
			return "Good Morning, " + user;
		} else if (hour < 16) {
			return "Good Afternoon, " + user;
		} else if (hour < 20) {
			return "Good Evening, " + user;
		} else {
			return "Good Night, " + user;
		}
	}

}

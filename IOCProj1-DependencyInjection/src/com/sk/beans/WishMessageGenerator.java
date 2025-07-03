package com.sk.beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {

	private LocalTime time;
	private LocalDate date;
	
	private int age;
	private String email;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}

	public void setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public void setAge(int age) {
		System.out.println("WishMessageGenerator.setAge()");
		this.age = age;
	}

	public void setEmail(String email) {
		System.out.println("WishMessageGenerator.setName()");
		this.email = email;
	}

	public LocalTime getTime() {
		return time;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getWishMessage(String user) {

		int hour = time.getHour();

		if (hour < 12)
			return "Good Morning, " + user;
		else if (hour < 16)
			return "Good Afternoon, " + user;
		else if (hour < 20)
			return "Good Evening, " + user;
		else
			return "Good Night, " + user;

	}
}

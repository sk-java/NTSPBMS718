package com.sk.sbeans;

import java.time.LocalDateTime;

public class WishMessageGenerator {

	private LocalDateTime currentDateTime;

	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	public String generateWishMessage() {
		int hour = currentDateTime.getHour();
		if (hour < 12) {
			return "Good Morning";
		} else if (hour < 18) {
			return "Good AfterNoon";
		} else {
			return "Good Evening";
		}
	}

}

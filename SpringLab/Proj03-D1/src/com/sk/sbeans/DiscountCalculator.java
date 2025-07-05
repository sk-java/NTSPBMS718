package com.sk.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {

	private LocalDate currentDate;
	private double price;

	public void setCurrentDateTime(LocalDate currentDate) {
		this.currentDate = currentDate;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateDiscount() {
		DayOfWeek day = currentDate.getDayOfWeek();

		double discountRate = (day == DayOfWeek.SATURDAY) || (day == DayOfWeek.SUNDAY) ? 0.20 : 0.10;
		return price - (price - discountRate);
	}

}

package com.sk.sbeans;

import java.time.LocalDate;

public class SeasonFinder {

	private LocalDate date;

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getSeasonName() {
		int month = date.getMonthValue();
		if (month >= 3 && month <= 5) {
			return "Spring season";
		} else if (month > 5 && month <= 8) {
			return "Summer season";
		} else if (month > 8 && month <= 11) {
			return "Autumn season";
		} else {
			return "Winter season";
		}
	}
}

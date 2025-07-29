package com.sk.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired  // field injection
	private LocalDate date; // HAS-A property
	@Autowired  // field injection
	private LocalTime time; // HAS-A property

	public SeasonFinder() {
		System.out.println("SeasonFinder::0-param constructor");
	}

	/*	
		// Constructor Injection
		@Autowired
		public SeasonFinder(LocalDate date, LocalTime time) {
			System.out.println("SeasonFinder:: parameterized constructor");
			this.date = date;
			this.time = time;
		}
	*/
	

	/*	
		// setter method for setter injection
		@Autowired
		public void setDate(LocalDate date) {
			this.date = date;
			System.out.println("SeasonFinder.setDate()");
		}
	
		@Autowired
		public void setTime(LocalTime time) {
			this.time = time;
			System.out.println("SeasonFinder.setTime()");
		}
	*/
	
	/*	
		// Arbitrary method for setter injection
		@Autowired
		public void assignDate(LocalDate date) {
			this.date = date;
			System.out.println("SeasonFinder.setDate()");
		}
	
		@Autowired
		public void putTime(LocalTime time) {
			this.time = time;
			System.out.println("SeasonFinder.setTime()");
		}
	 */
	
	

	// business method
	public String showSeasonName() {
		System.out.println("SeasonFinder.showSeasonName()" + "..." + date + "..." + time);
		// get current month value
		int month = date.getMonthValue();
		if (month >= 3 && month <= 6) {
			return "Summer Season";
		} else if (month >= 7 && month <= 9) {
			return "Rainy Season";
		} else {
			return "Winter Season";
		}
	}

}

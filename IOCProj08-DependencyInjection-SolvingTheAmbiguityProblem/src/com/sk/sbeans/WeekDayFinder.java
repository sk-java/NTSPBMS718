package com.sk.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WeekDayFinder {

	@Autowired
	@Qualifier("ldate1")
	private LocalDate date;
	
		// for Constructor Injection 
		@Autowired
		public WeekDayFinder(@Qualifier("ldate") LocalDate date) {
			this.date = date;
		}
	
		// for Arbitrary method Injection
		@Autowired
		@Qualifier("ldate2")
		public void putDate(LocalDate date) {
			this.date = date;
		}
		
		// for Setter Injection
		@Autowired
		@Qualifier("ldate3")
		public void setDate(LocalDate date) {
			this.date = date;
		}
		
		
	
	// business method
	public String showGreetMessage(String name) {
		int week = date.getDayOfWeek().getValue();
		if (week != 6 && week != 7) {
			return "Happy Workday::" + name+ " Date: "+date;
		} else {
			return "Happy Holiday, Enjoy ur paid holidays::" + name + " date: "+date;
		}
	}
}

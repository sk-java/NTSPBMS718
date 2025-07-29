package com.sk.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wf")
public class WeekDayFinder {

	@Autowired
	private LocalDate date;

	public WeekDayFinder() {
		System.out.println("WeekDayFinder:0-param constructor");
	}

	public String showGreetMessage(String name) {
		int week = date.getDayOfWeek().getValue();
		if (week != 6 && week != 7) {
			return "Happy Workday"+name;
		} else {
			return "Happy Holiday, Enjoy ur paid holidays"+name;
		}
	}

}

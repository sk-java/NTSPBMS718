package com.sk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.WeekDayFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			WeekDayFinder finder = ctx.getBean(WeekDayFinder.class);
			System.out.println(finder.showGreetMessage("Scott"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

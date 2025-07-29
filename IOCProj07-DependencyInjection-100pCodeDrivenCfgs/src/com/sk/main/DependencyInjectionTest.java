package com.sk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.WeekDayFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {

			// get target spring bean class obj ref
			WeekDayFinder finder = ctx.getBean("wf", WeekDayFinder.class);
			// invoking business method
			System.out.println("Result::" + finder.showGreetMessage(" Santosh"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

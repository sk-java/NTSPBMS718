package com.sk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/ApplicationContext.xml");

		SeasonFinder res = (SeasonFinder) ctx.getBean("sf");

		System.out.println("Current Season is : " + res.getSeasonName());
	}

}

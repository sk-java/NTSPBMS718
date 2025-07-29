package com.sk.main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sk.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/sk/cfgs/applicationContext.xml");) {

			SeasonFinder finder = ctx.getBean("sf", SeasonFinder.class);
			String seasonName = finder.showSeasonName();
			System.out.println(seasonName);
			System.out.println("======================================");

			System.out.println("Spring Beans count:" + ctx.getBeanDefinitionCount());
			System.out.println("Spring Bean Definition names/ids:" + Arrays.toString(ctx.getBeanDefinitionNames()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.sk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.ECommerceStore;

public class StrategyDPTest {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			ECommerceStore store = ctx.getBean("ecs", ECommerceStore.class);
			String shopping = store.shopping(new String[] { "idol", "laddu", "decoration" },
					new double[] { 6000.0, 5550.0, 100000.0 });
			System.out.println(shopping);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

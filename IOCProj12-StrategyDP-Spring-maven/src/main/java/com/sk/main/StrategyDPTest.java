package com.sk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {

			Flipkart fkart = ctx.getBean(Flipkart.class);

			String result = fkart.shopping(new String[] { "flag", "sweets", "white dress" },
					new double[] { 200.0, 400.0, 600.0 });

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

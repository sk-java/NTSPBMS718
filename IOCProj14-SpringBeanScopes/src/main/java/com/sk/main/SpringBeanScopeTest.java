package com.sk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.ECommerceStore;

public class SpringBeanScopeTest {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			ECommerceStore store1 = ctx.getBean("ecs", ECommerceStore.class);
			ECommerceStore store2 = ctx.getBean("ecs", ECommerceStore.class);

			System.out.println(store1.hashCode() + " " + store2.hashCode());
			System.out.println("store1==store2 ? " + (store1 == store2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.sk.main;

import java.lang.reflect.Constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.ston.Printer;

public class SpringBeanScopeTest1 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			Printer prn1 = ctx.getBean("p1", Printer.class);
			Printer prn2 = ctx.getBean("p2", Printer.class);
			System.out.println(prn1.hashCode() + " " + prn2.hashCode());
			System.out.println("p1==p2 ? " + (prn1 == prn2));

			System.out.println("==============================");

			Class clazz = Class.forName("com.sk.ston.Printer");
			Constructor[] cons = clazz.getDeclaredConstructors();
			cons[0].setAccessible(true);
			Object obj1 = cons[0].newInstance();
			Object obj2 = cons[0].newInstance();
			System.out.println(obj1.hashCode() + "...." + obj2.hashCode());
			System.out.println(obj1.getClass()+"...."+obj2.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

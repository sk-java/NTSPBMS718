package com.sk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.sbeans.A;
import com.sk.sbeans.B;

public class CyclicInjectionTest {

	public static void main(String[] args) {

		try (FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/sk/cfgs/applicationContext.xml");) {

			System.out.println("CyclicInjectionTest.main()");

			A a = (A) ctx.getBean("a1");
			System.out.println("a=" + a);
			System.out.println("================");
			B b = (B) ctx.getBean("b1");
			System.out.println("b=" + b);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

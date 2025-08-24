package com.sk.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sk.config.AppConfig;
import com.sk.sbeans.ECommerceStore;

public class DefaultBeanIdsTest {
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			
			System.out.println("Spring Beans count: "+ctx.getBeanDefinitionCount());
			System.out.println("Spring Bean Ids: "+Arrays.toString(ctx.getBeanDefinitionNames()));
			
			ECommerceStore store1 = ctx.getBean("ecs", ECommerceStore.class);
			System.out.println("Class Name: "+store1.getClass());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

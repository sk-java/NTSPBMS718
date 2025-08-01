package com.sk.main;

import com.sk.comps.ICar;
import com.sk.factory.TATACarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {

		ICar car = TATACarFactory.getInstance("nexon");
		car.makeCar();
		car.testDrive();

		System.out.println("=================================================");

		ICar car1 = TATACarFactory.getInstance("Safari");
		car1.makeCar();
		car1.testDrive();
	}

}

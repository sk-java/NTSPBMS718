package com.sk.comps;

public class SafariCar implements ICar {

	public SafariCar() {
		System.out.println("SafariCar:: 0-param constructor");
	}

	@Override
	public void makeCar() {
		System.out.println("SafariCar.makeCar() ----> manufacturing Safari Car");
	}

	@Override
	public void testDrive() {
		System.out.println("SafariCar.testDrive() ----> test driving the Safari Car");
	}

}

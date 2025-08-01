package com.sk.comps;

public class NexonCar implements ICar {

	public NexonCar() {
		System.out.println("NexonCar:: 0-param constructor");
	}

	@Override
	public void makeCar() {
		System.out.println("NexonCar.makeCar() ----> manufacturing Nexon Car");
	}

	@Override
	public void testDrive() {
		System.out.println("NexonCar.testDrive() ----> test driving Nexon Car");
	}

}

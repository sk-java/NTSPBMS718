package com.sk.sbeans;

public class A {
	private B b;

	public A() {
		System.out.println("A::0-param constructor");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "From A";
	}

}

package com.devculi.designpattern.creationals.factory.bean;

public class Chicken extends Bird {

	public Chicken(String name, String gender, Integer age, Integer weight) {
		super(name, gender, age, weight);
	}

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}
}

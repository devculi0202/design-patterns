package com.devculi.designpattern.creationals.factory.problems;

public class Eagle extends Chicken {

	public Eagle(String name, String gender, Integer age, Integer weight) {
		super(name, gender, age, weight);
	}

	@Override
	public void fly() {
		System.out.println("I can sour high");
	}

}

package com.devculi.designpattern.creationals.factory.problems;

public class Bird extends Animal implements BirdBehavior {

	public Bird(String name, String gender, Integer age, Integer weight) {
		super(name, gender, age, weight);
	}

	@Override
	public void fly() {
		System.out.println("I'm can fly");
	}

}

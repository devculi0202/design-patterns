package com.devculi.designpattern.creationals.factory.problems;

public class Reptile extends Animal implements ReptileBehavior {
	public Reptile(String name, String gender, Integer age, Integer weight) {
		super(name, gender, age, weight);
	}

	@Override
	public void leap() {
		System.out.println("I can leap");
	}

}

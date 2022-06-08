package com.devculi.designpattern.creationals.factory.bean;

import com.devculi.designpattern.creationals.factory.problems.ReptileBehavior;

public class Reptile extends Animal implements ReptileBehavior {
	public Reptile(String name, String gender, Integer age, Integer weight) {
		super(name, gender, age, weight);
	}

	@Override
	public void leap() {
		System.out.println("I can leap");
	}

}

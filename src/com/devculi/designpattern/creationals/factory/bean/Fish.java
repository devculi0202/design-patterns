package com.devculi.designpattern.creationals.factory.bean;

import com.devculi.designpattern.creationals.factory.problems.FishBehavior;

public class Fish extends Animal implements FishBehavior {

	public Fish(String name, String gender, Integer age, Integer weight) {
		super(name, gender, age, weight);
	}

	@Override
	public void swim() {
		System.out.println("I can swim");
	}



}

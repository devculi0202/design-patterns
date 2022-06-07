package com.devculi.designpattern.creationals.factory.solve;

import com.devculi.designpattern.creationals.factory.problems.Animal;
import com.devculi.designpattern.creationals.factory.problems.Chicken;
import com.devculi.designpattern.creationals.factory.problems.Dophin;
import com.devculi.designpattern.creationals.factory.problems.Eagle;
import com.devculi.designpattern.creationals.factory.problems.Frog;
import com.devculi.designpattern.creationals.factory.problems.Shark;

public class ZooFactory {
	private Animal animal;

	public Animal createAnimal(String animalName) {
		if (animalName.equalsIgnoreCase(Animals.CHICKEN.name()))
			animal = new Chicken("chicken", "female", 1, 1);
		else if (animalName.equalsIgnoreCase(Animals.EAGLE.name())) {
			animal = new Eagle("eagle", "female", 2, 2);
		} else if (animalName.equalsIgnoreCase(Animals.FROG.name())) {
			animal = new Frog("frog", "male", 1, 1);
		} else if (animalName.equalsIgnoreCase(Animals.SHARK.name())) {
			animal = new Shark("shark", "male", 3, 150);
		} else if (animalName.equalsIgnoreCase(Animals.DOPHIN.name())) {
			animal = new Dophin("dophin", "female", 2, 90);
		}
		return animal;
	}
}
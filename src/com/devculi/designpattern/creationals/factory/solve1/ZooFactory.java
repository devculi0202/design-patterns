package com.devculi.designpattern.creationals.factory.solve1;

import com.devculi.designpattern.creationals.factory.bean.Animal;
import com.devculi.designpattern.creationals.factory.bean.Chicken;
import com.devculi.designpattern.creationals.factory.bean.Dophin;
import com.devculi.designpattern.creationals.factory.bean.Eagle;
import com.devculi.designpattern.creationals.factory.bean.Frog;
import com.devculi.designpattern.creationals.factory.bean.Peacock;
import com.devculi.designpattern.creationals.factory.bean.Shark;

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
		} else if (animalName.equalsIgnoreCase(Animals.PEACOCK.name())) {
			animal = new Peacock("peacock", "female", 1, 3);
		}
		return animal;
	}
}

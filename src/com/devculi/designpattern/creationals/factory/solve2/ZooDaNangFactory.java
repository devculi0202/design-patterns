package com.devculi.designpattern.creationals.factory.solve2;

import com.devculi.designpattern.creationals.factory.bean.Animal;
import com.devculi.designpattern.creationals.factory.bean.Chicken;
import com.devculi.designpattern.creationals.factory.bean.Eagle;
import com.devculi.designpattern.creationals.factory.bean.Frog;
import com.devculi.designpattern.creationals.factory.bean.Shark;
import com.devculi.designpattern.creationals.factory.solve1.Animals;

public class ZooDaNangFactory implements ZooFactory {
	private Animal animal;

	@Override
	public Animal createAnimal(String nameAnimal) {
		if (nameAnimal.equalsIgnoreCase(Animals.CHICKEN.name()))
			animal = new Chicken("chicken", "female", 1, 1);
		else if (nameAnimal.equalsIgnoreCase(Animals.EAGLE.name())) {
			animal = new Eagle("eagle", "female", 2, 2);
		} else if (nameAnimal.equalsIgnoreCase(Animals.FROG.name())) {
			animal = new Frog("frog", "male", 1, 1);
		} else if (nameAnimal.equalsIgnoreCase(Animals.SHARK.name())) {
			animal = new Shark("shark", "male", 3, 150);
		}
		return animal;
	}
}

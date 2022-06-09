package com.devculi.designpattern.creationals.factory.solve2;

import com.devculi.designpattern.creationals.factory.bean.Animal;
import com.devculi.designpattern.creationals.factory.bean.Chicken;
import com.devculi.designpattern.creationals.factory.bean.Eagle;
import com.devculi.designpattern.creationals.factory.solve1.Animals;

public class ZooHCMFactory implements ZooFactory {
	private Animal animal;

	@Override
	public Animal createAnimal(String nameAnimal) {
		if (nameAnimal.equalsIgnoreCase(Animals.CHICKEN.name()))
			animal = new Chicken("chicken", "female", 1, 1);
		else if (nameAnimal.equalsIgnoreCase(Animals.EAGLE.name())) {
			animal = new Eagle("eagle", "female", 2, 2);
		}
		return animal;

	}


}

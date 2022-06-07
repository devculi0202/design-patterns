package com.devculi.designpattern.creationals.factory.solve;

import com.devculi.designpattern.creationals.factory.problems.Animal;

public class Zoo {
	private ZooFactory zooFactory;

	public Zoo(ZooFactory zooFactory) {
		this.zooFactory = zooFactory;
	}

	public static void main(String[] args) {
            Zoo zoo = new Zoo(new ZooFactory());
            Animal chicken = zoo.getAnimalByName("Chicken");
            System.out.println(chicken.toString());
            Animal dophin = zoo.getAnimalByName("Dophin");
            System.out.println(dophin.toString());
            Animal frog = zoo.getAnimalByName("Frog");
            System.out.println(frog.toString());
            Animal shark = zoo.getAnimalByName("Shark");
            System.out.println(shark.toString());
            Animal eagle = zoo.getAnimalByName("Eagle");
            System.out.println(eagle.toString());
	}

	public Animal getAnimalByName(String name) {
		return zooFactory.createAnimal(name);
	}




}

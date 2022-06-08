package com.devculi.designpattern.creationals.factory.solve1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.devculi.designpattern.creationals.factory.bean.Animal;
import com.devculi.designpattern.creationals.factory.bean.Bird;
import com.devculi.designpattern.creationals.factory.bean.Fish;
import com.devculi.designpattern.creationals.factory.bean.Reptile;
import com.devculi.designpattern.creationals.factory.bean.Veterinarian;

public class Zoo {
	private ZooFactory zooFactory;

	public Zoo(ZooFactory zooFactory) {
		this.zooFactory = zooFactory;
	}

	public static void main(String[] args) {
		Zoo zoo = new Zoo(new ZooFactory());
		Bird chicken = (Bird) zoo.getAnimalByName("Chicken");
		chicken.eat();
		chicken.sleep();
		chicken.move();
		chicken.fly();
		System.out.println(chicken.toString());
		System.out.println("----------------");

		Fish dophin = (Fish) zoo.getAnimalByName("Dophin");
		dophin.eat();
		dophin.sleep();
		dophin.move();
		dophin.swim();
		System.out.println(dophin.toString());
		System.out.println("----------------");

		Reptile frog = (Reptile) zoo.getAnimalByName("Frog");
		frog.eat();
		frog.sleep();
		frog.move();
		frog.leap();
		System.out.println(frog.toString());
		System.out.println("----------------");

		Fish shark = (Fish) zoo.getAnimalByName("Shark");
		shark.eat();
		shark.sleep();
		shark.move();
		shark.swim();
		System.out.println(shark.toString());
		System.out.println("----------------");

		Bird eagle = (Bird) zoo.getAnimalByName("Eagle");
		eagle.eat();
		eagle.sleep();
		eagle.move();
		eagle.fly();
		System.out.println(eagle.toString());
		System.out.println("----------------");

		Bird peacock = (Bird) zoo.getAnimalByName("Peacock");
		peacock.eat();
		peacock.sleep();
		peacock.move();
		peacock.fly();
		System.out.println(peacock.toString());

		List<Fish> fishes = new ArrayList<>();
		fishes.add(dophin);
		fishes.add(shark);

		Map<String, Fish> fishesMap = collectFishesTypeToMap(fishes);
		Veterinarian veterinarian = new Veterinarian();
		veterinarian.checkWeightForFish("dophin", fishesMap);
	}

	public Animal getAnimalByName(String name) {
		return zooFactory.createAnimal(name);
	}

	public static Map<String, Fish> collectFishesTypeToMap(List<Fish> fishes) {
		Map<String, Fish> fishesMap = new HashMap<>();
		fishes.forEach(fish -> {
			fishesMap.put(fish.getName(), fish);
		});
		return fishesMap;
	}

}

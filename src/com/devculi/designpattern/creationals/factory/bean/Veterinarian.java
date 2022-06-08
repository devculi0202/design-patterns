package com.devculi.designpattern.creationals.factory.bean;

import java.util.Map;
import java.util.Optional;

//Bac si thu y
public class Veterinarian {

	public void checkWeightForFish(String name, Map<String, Fish> fishes) {
		Optional<String> nameFishOpt = fishes.keySet().stream().filter(fishName -> fishName.equalsIgnoreCase(name))
				.findFirst();
		if (nameFishOpt.isPresent()) {
			Fish fish = fishes.get(nameFishOpt.get());
			if (fish.getWeight() >= 100 && fish.getWeight() <= 999)
				System.out.println("Health " + fish.getName() + " OK");
			else {
				System.out.println("Health " + fish.getName() + " not OK");
			}
		} else {
			System.out.println("That animal doesn't exist");
		}
	}
}

package com.devculi.designpattern.creationals.factory.problems;

import java.util.HashMap;
import java.util.Map;

import com.devculi.designpattern.creationals.factory.bean.Bird;
import com.devculi.designpattern.creationals.factory.bean.Chicken;
import com.devculi.designpattern.creationals.factory.bean.Dophin;
import com.devculi.designpattern.creationals.factory.bean.Eagle;
import com.devculi.designpattern.creationals.factory.bean.Fish;
import com.devculi.designpattern.creationals.factory.bean.Frog;
import com.devculi.designpattern.creationals.factory.bean.Reptile;
import com.devculi.designpattern.creationals.factory.bean.Shark;
import com.devculi.designpattern.creationals.factory.bean.Veterinarian;

public class Zoo {
	public static void main(String[] args) {
		Reptile frog = new Frog("frog","male", 1, 1);
		System.out.println(frog.toString());
		frog.eat();
		frog.sleep();
		frog.move();
		frog.leap();

		System.out.println("----------------");
		Bird chicken = new Chicken("chicken","female", 1, 1);
		System.out.println(chicken.toString());
		chicken.eat();
		chicken.sleep();
		chicken.move();
		chicken.fly();

		Bird eagle = new Eagle("eagle","female", 2, 2);
		System.out.println(eagle.toString());
		eagle.eat();
		eagle.sleep();
		eagle.move();
		eagle.fly();

		System.out.println("----------------");
		Fish dophin = new Dophin("dophin","female", 2, 90);
		System.out.println(dophin.toString());
		dophin.eat();
		dophin.sleep();
		dophin.move();
		dophin.swim();

		System.out.println("----------------");
		Fish shark = new Shark("shark", "male", 3, 150);
		System.out.println(shark.toString());
		shark.eat();
		shark.sleep();
		shark.move();
		shark.swim();

		Map<String, Fish> fishes = new HashMap<>();
		fishes.put(dophin.getName(), dophin);
		fishes.put(shark.getName(), shark);

		Veterinarian veterinarian = new Veterinarian();
		veterinarian.checkWeightForFish("shark", fishes);
	}
}

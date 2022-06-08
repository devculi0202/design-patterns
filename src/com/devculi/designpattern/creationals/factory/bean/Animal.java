package com.devculi.designpattern.creationals.factory.bean;

public abstract class Animal {
	private String name;
	private String gender;
	private Integer age;
	private Integer weight;

	public Animal(String name, String gender, Integer age, Integer weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	public void sleep() {
		System.out.println("I'm sleeping");
	}

	public void eat() {
		System.out.println("I'm eating");
	}

	public  void move() {
		System.out.println("I can move");
	}

	public String toString() {
		return "Animal [name=" + name + ", gender=" + gender + ", age=" + age + ", weight=" + weight + "]";
	}




}

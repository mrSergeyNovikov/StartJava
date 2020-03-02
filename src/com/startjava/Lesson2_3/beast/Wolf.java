package com.startjava.Lesson2_3.beast;

public class Wolf {

	private String name;
	private String sex;
	private int age;
	private double weight;
	private String color;

	// сеттеры и геттеры
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 8) {
			this.age = age;
		} else {
			System.out.println("Некорректный возраст. Присвойте меньше 8");
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
	}

	public void sit() {
	}

	public void run() {
	}

	public void earn() {
	}

	public void hunt() {
	}
}
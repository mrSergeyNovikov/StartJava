package com.startjava.Lesson2_3.beast;

public class WolfTest {

	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.setName("Хелсинг");
		System.out.println("Кличка: " + wolf.getName());
		wolf.setSex("Волк");
		System.out.println("Пол: " + wolf.getSex());
		wolf.setAge(10);
		System.out.println("Возраст: " + wolf.getAge());
		wolf.setWeight(50.3);
		System.out.println("Вес: " + wolf.getWeight());
		wolf.setColor("Черный");
		System.out.println("Окрас: " + wolf.getColor());
		
		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.earn();
		wolf.hunt();
	}
}
package com.startjava.Lesson2_3.robot;

public class Jaeger {

	private String modelName;
	private String mark;
	private String status;
	private String os;
	private float height;
	private float weight;
	private int speed;
	private int strange;
	private int armor;

	public Jaeger(String modelName, String mark, String status, String os, float height, float weight, int speed, int strange, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.status = status;
		this.os = os;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strange = strange;
		this.armor = armor;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getStatus() {
		return status;
	}

	public String getOs() {
		return os;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getStrange() {
		return strange;
	}

	public int getArmor() {
		return armor;
	}

	public void move() {
		System.out.println("Егерь двигается...");
	}

	public boolean drift() {
		System.out.println("Дрифт...");
		return true;
	}

	public String scanKaiju() {
		int typeKiaju = 2;
		String result = "";
		if(typeKiaju == 1) {
			result = "Сканирование...Kaiju 1 уровня найден";
		} else if (typeKiaju == 2) {
			result = "Сканирование....Kaiju 2 уровня найден";
		}
		System.out.println(result);
		return result;
	}

	public void dodge() {
		System.out.println("Егерь уклоняется...");
	}

	@Override
	public String toString() {
		return "Егерь: '" + modelName + '\'' + "\n" +
				"Модель: '" + mark + '\'' + "\n" +
				"Статус:'" + status + '\'' + "\n" +
				"Орерационная система:'" + os + '\'' + "\n" +
				"Высота: " + height + "\n" +
				"Вес: " + weight + "\n" +
				"Скорость: " + speed + "\n" +
				"Сила: " + strange + "\n" +
				"Броня:" + armor;
	}
}
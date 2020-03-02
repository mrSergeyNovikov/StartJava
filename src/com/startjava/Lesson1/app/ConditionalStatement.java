package com.startjava.Lesson1.app;

public class ConditionalStatement {

	public static void main(String[] args) {
		byte age = 25;
		if(age > 20) {
			System.out.println("Вы уже взрослый");
		} 

		boolean isMan = true;
		if(isMan) {
			System.out.println("Оказывается, вы мужчина");
		}

		if (!isMan) {
			System.out.println("Жаль, вы не мужчина");
		}

		float growth = 1.75f;
		if(growth < 1.80) {
			System.out.println("Вы среднего роста");
		} else {
			System.out.println("Вы очень высокий");
		}

		char firstNameLetter = 'И';
		if(firstNameLetter == 'М') {
			System.out.println("Наверно вас зовут Михаил");
		} else if(firstNameLetter == 'И') {
			System.out.println("Наверно вас зовут Игорь");
		} else {
			System.out.println("Я не заю как вас зовут");
		}
	}
}
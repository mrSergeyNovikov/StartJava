package com.startjava.Lesson1.app;

public class Circle {

	public static void main(String[] args) {
		outputNumbers();
		outputNumbersWithIterration();
		sumOddNumbers();
	}

	// Выведите на консоль с помощью цикла for все числа от [0, 20]
	public static void outputNumbers() {
		for (int i = 0; i <= 20 ; i++) {
			System.out.println("Число: " + i);
		}
	}

	// Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
	public static void outputNumbersWithIterration() {
		int i = 8;
		while (i > -6) {
			i -= 2;
			System.out.print(i + " ");
		}
	}

	// Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
	public static void sumOddNumbers() {
		int i = 10;
		int result = 0;
		do {
			if (i % 2 == 1) {
				result += i;
			}
			i++;
		} while(i <= 20);
		System.out.println("Результат суммы нечетных чисел: " + result);
	}	
}
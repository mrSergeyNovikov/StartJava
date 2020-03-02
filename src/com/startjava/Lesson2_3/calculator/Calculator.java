package com.startjava.Lesson2_3.calculator;

import java.util.Scanner;

public class Calculator {

	public void calculate( int firstNumber, char operator, int secondNumber) {
		double result = 0;

		switch (operator) {
			case '+':
				result = firstNumber + secondNumber;
				System.out.println("Сложение... Ответ: " + result);
				break;
			case '-':
				result = firstNumber - secondNumber;
				System.out.println("Вычитание... Ответ: " + result);
				break;
			case '/':
				result = firstNumber / secondNumber;
				System.out.println("Деление... Ответ: " + result);
				break;
			case '*':
				result = firstNumber * secondNumber;
				System.out.println("Умножение... Ответ: " + result);
				break;
			case '^':
				result = 1;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				System.out.println("Возведение в степень... Ответ: " + result);
				break;
			case '%':
				result = firstNumber % secondNumber;
				System.out.println("Деление по модулю... Ответ: " + result);
				break;
			default:
				System.out.println("Неверный символ. Ответа не будет.");
		}
	}
}
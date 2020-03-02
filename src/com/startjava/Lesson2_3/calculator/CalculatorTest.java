package com.startjava.Lesson2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answerOnQuestion;

		do {
			System.out.println("Введите первое число: ");
			int firstNumber = scan.nextInt();
			System.out.println("Введите знак математической операции: ");
			char operator = scan.next().charAt(0);
			System.out.println("Введите второе число: ");
			int secondNumber = scan.nextInt();
			calc.calculate(firstNumber, operator, secondNumber);
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answerOnQuestion = scan.next();
			} while (!answerOnQuestion.equalsIgnoreCase("да") && !answerOnQuestion.equalsIgnoreCase("нет"));
		} while(answerOnQuestion.equalsIgnoreCase("да"));
		System.out.println("До свидания. Спасибо за игру...");
	}
}
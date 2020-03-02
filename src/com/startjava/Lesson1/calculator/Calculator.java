package com.startjava.Lesson1.calculator;

public class Calculator {
// Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) 
// над целыми положительными числами
// для проверки знака математической операции воспользуйтесь оператором if else
// выведите на экран результат работы калькулятора с помощью System.out.println()

	public static void main(String[] args) {
		int firstNumber = 4;
		int secondNumber = 5;
		char operation = '^';
		double result = 0;

		if(operation == '+') {
			result = firstNumber + secondNumber;
			System.out.println("Сложение... Ответ: " + result);
		} else if(operation == '-') {
			result = firstNumber - secondNumber;
			System.out.println("Вычитание... Ответ: " + result);
		} else if(operation == '/') {
			result = firstNumber / secondNumber;
			System.out.println("Деление... Ответ: " + result);
		} else if(operation == '*') {
			result = firstNumber * secondNumber;
			System.out.println("Умножение... Ответ: " + result);
		} else if(operation == '^') {
			result = 1;
			for (int i = 0; i < secondNumber; i++) {
				result *= firstNumber;
			}
			System.out.println("Возведение в степень... Ответ: " + result);
		} else if(operation == '%') {
			result = firstNumber % secondNumber;
			System.out.println("Деление по модулю... Ответ: " + result);
		}	
	}
}
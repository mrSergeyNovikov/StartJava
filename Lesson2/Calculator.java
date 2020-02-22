import java.util.Scanner;

public class Calculator {

	int circleOne = 1;
	int circleTwo = 1;
	double result = 0;

// метод для арифметических операций
	public void runCalculator() {
		while (circleOne != 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите первое число: ");
			int firstNumber = scan.nextInt();
			System.out.println("Введите знак математической операции: ");
			String operator = scan.next();
			System.out.println("Введите второе число: ");
			int secondNumber = scan.nextInt();

			switch (operator) {
				case "+":
					result = firstNumber + secondNumber;
					System.out.println("Сложение... Ответ: " + result);
					break;
				case "-":
					result = firstNumber - secondNumber;
					System.out.println("Вычитание... Ответ: " + result);
					break;
				case "/":
					result = firstNumber / secondNumber;
					System.out.println("Деление... Ответ: " + result);
					break;
				case "*":
					result = firstNumber * secondNumber;
					System.out.println("Умножение... Ответ: " + result);
					break;
				case "^":
					result = 1;
					for (int i = 0; i < secondNumber; i++) {
						result *= firstNumber;
					}
					System.out.println("Возведение в степень... Ответ: " + result);
					break;
				case "%":
					result = firstNumber % secondNumber;
					System.out.println("Деление по модулю... Ответ: " + result);
					break;
				default:
					System.out.println("Неверный символ. Ответа не будет.");
			}

			continueCalculator();
			circleOne = 0;
		}
	}

// метод для продолжения программы
	public void continueCalculator() {
		while(circleTwo != 0) {
			System.out.println("Хотите продолжить? [да/нет]: ");
			Scanner scan2 = new Scanner(System.in);
			String answerOnQuestion = scan2.nextLine();

			if (answerOnQuestion == "да") {
				System.out.println("Ответ - да. Продолжайте");
				runCalculator();
			} else if (answerOnQuestion == "нет") {
				System.out.println("Ответ - нет...Выход из программы");
				circleTwo = 0;
			} else {
				continueCalculator();
			}
		}
	}
}
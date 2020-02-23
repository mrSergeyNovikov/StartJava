import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		calculate();
	}

	// метод для арифметических операций
	static void calculate() {
		int variableCycle = 1;
		double result = 0;

		Calculator calc = new Calculator();

		while (variableCycle != 0) {
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
			calc.continueCalculator();
			variableCycle = 0;
		}
	}
}
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
			while (true) {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answerOnQuestion = scan.next();
				if (answerOnQuestion.equalsIgnoreCase("да") || answerOnQuestion.equalsIgnoreCase("нет")) {
					break;
				} else {
					continue;
				}
			}
			} while(answerOnQuestion.equalsIgnoreCase("да"));
		System.out.println("До свидания. Спасибо за игру...");
	}
}
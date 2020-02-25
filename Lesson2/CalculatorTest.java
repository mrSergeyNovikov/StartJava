import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Введите первое число: ");
			int firstNumber = scan.nextInt();
			System.out.println("Введите знак математической операции: ");
			char operator = scan.next().charAt(0);
			System.out.println("Введите второе число: ");
			int secondNumber = scan.nextInt();
			calc.calculate(firstNumber, operator, secondNumber);

			System.out.println("Хотите продолжить? [да/нет]: ");
			String answerOnQuestion = scan.next();
			if (answerOnQuestion.equals("да")) {
				System.out.println("Ответ - да. Продолжайте");
				continue;
			} else if (answerOnQuestion.equals("нет")) {
				System.out.println("Ответ - нет...Выход из программы");
				break;
			} else {
				System.out.println("Хотите продолжить? [да/нет]: ");
			}
			break;
		}
	}
}
import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Введите первое число: ");
			int firstNumber = scan.nextInt();
			System.out.println("Введите знак математической операции: ");
			String operator = scan.next();
			System.out.println("Введите второе число: ");
			int secondNumber = scan.nextInt();
			calc.calculate(firstNumber, operator, secondNumber);
			System.out.println("Хотите продолжить? [да/нет]: ");
			String answerOnQuestion = scan.nextLine();
			calc.continueCalculator(answerOnQuestion);
			break;
		}
	}
}
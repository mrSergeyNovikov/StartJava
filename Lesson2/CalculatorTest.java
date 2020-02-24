import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		boolean variableCycle = true;

		while (variableCycle) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите первое число: ");
			int firstNumber = scan.nextInt();
			System.out.println("Введите знак математической операции: ");
			calc.calculate();
			System.out.println("Введите второе число: ");
			int secondNumber = scan.nextInt();

			continueCalculator();
			variableCycle = false;
		}
	}

	// метод для продолжения программы
	public void continueCalculator() {
		while(variableCycle != 0) {
			System.out.println("Хотите продолжить? [да/нет]: ");
			Scanner scan2 = new Scanner(System.in);
			String answerOnQuestion = scan2.nextLine();

			if (answerOnQuestion == "да") {
				System.out.println("Ответ - да. Продолжайте");
				//calculate();
			} else if (answerOnQuestion == "нет") {
				System.out.println("Ответ - нет...Выход из программы");
				variableCycle = 0;
			} else {
				continue;
			}
		}
	}
}
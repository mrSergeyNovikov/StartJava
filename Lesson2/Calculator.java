import java.util.Scanner;

public class Calculator {

	int variableCycle = 1;
	double result = 0;

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
				continueCalculator();
			}
		}
	}
}
import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerOnQuestion = "да";

		System.out.println("Игра. Угадай чило от 0 до 100...");
		System.out.println();

		System.out.println("Игрок " + 1 + " введите имя: ");
		Player player1 = new Player(scan.next());
		System.out.println("Игрок " + 2 + " введите имя: ");
 		Player player2= new Player(scan.next());

		do {


			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answerOnQuestion = scan.next();
			} while (!answerOnQuestion.equalsIgnoreCase("да") && !answerOnQuestion.equalsIgnoreCase("нет"));
		} while (answerOnQuestion.equalsIgnoreCase("да"));
		System.out.println("Пока! ");
	}
}
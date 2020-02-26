import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerOnQuestion;
		Guess guess = new Guess(new Player("Виктор", 1), new Player("Сергей", 2));

		System.out.println("Игра. Угадай чило от 0 до 100...");
		System.out.println();
		System.out.println("Игрок: " + guess.player1.getName() + "." + " Участник под номером: " + guess.player1.getNumber());
		System.out.println("Игрок: " + guess.player2.getName() + "." + " Участник под номером: " + guess.player2.getNumber());

		do {
			System.out.println("Игрок " + guess.player1.getName() + " вводите число: ");
			guess.checkEnteredNumber();
			System.out.println("Игрок " + guess.player2.getName() + " вводите число: ");
			guess.checkEnteredNumber();
			if (guess.guessNumber == guess.enteredNumber) {
				do {
					System.out.println("Хотите продолжить? [да/нет]: ");
					answerOnQuestion = scan.next();
				} while (answerOnQuestion.equals("нет"));
			}
		} while (answerOnQuestion.equals("да"));
		System.out.println("Пока! ");
	}
}
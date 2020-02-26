import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerOnQuestion = "да";
		GuessNumber guess = new GuessNumber(new Player("Виктор", 1), new Player("Сергей", 2));

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
				while(true) {
					System.out.println("Хотите продолжить? [да/нет]: ");
					answerOnQuestion = scan.next();
					if (answerOnQuestion.equals("нет") || ) {
						break;
					} else if(answerOnQuestion.equals("да")) {
						guess.guessNumber = (int)(Math.random() * 100) + 1;
						break;
					}else {
						continue;
					}
				}
			}
		} while (answerOnQuestion.equals("да"));
		System.out.println("Пока!");
	}
}
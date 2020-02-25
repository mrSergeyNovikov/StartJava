import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GuessNumber guess = new GuessNumber();

		System.out.println("Игра. Угадай чило от 0 до 100...");
		Player player1 = new Player("Виктор", 1);
		System.out.println("Игрок: " + player1.getName() + "." + " Участник под номером: " + player1.getNumber());
		Player player2 = new Player("Сергей", 2);
		System.out.println("Игрок: " + player2.getName() + "." + " Участник под номером: " + player2.getNumber());

		while(true) {
			System.out.println("Игрок " + player1.getName() + " вводите число: ");
			int enteredNumber = scan.nextInt();
			guess.checkEnteredNumber(enteredNumber);
			System.out.println("Игрок " + player2.getName() + " вводите число: ");
			int enteredNumber2 = scan.nextInt();
			guess.checkEnteredNumber(enteredNumber2);

			if(enteredNumber == guess.guessNumber) {
				System.out.println(player1.getName() + " Победитель!!!");
				System.out.println("Хотите продолжить? [да/нет]");
				String answerOnQuestion = scan.next();
				if (answerOnQuestion.equals("да")) {
					continue;
				} else if (answerOnQuestion.equals("нет")) {
					break;
				} else {
					//не ясно как реализовать. Как пройтись снова по проверке "да/нет" условия
					System.out.println("Хотите продолжить? [да/нет]");
				}
			} else if(enteredNumber2 == guess.guessNumber) {
				System.out.println(player2.getName() + " Победитель!!!");
				continue;
			}
		}
	}
}
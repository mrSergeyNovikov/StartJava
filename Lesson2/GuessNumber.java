import java.util.Scanner;

public class GuessNumber {
	int guessNumber = (int)(Math.random() * 100) + 1;
	Scanner scan = new Scanner(System.in);

	public void checkEnteredNumber(int enteredNumber) {
		System.out.println("число для угадывания " + guessNumber);

		Player player = new Player();
		Player player1 = new Player("Виктор", 1);
		Player player2 = new Player("Сергей", 2);
		while (true) {
			if (enteredNumber < guessNumber) {
				System.out.println("Введеное вами число меньше задуманного");
			} else if (enteredNumber > guessNumber) {
				System.out.println("Введеное вами число больше задуманного ");
			}
			break;
		}
	}
}

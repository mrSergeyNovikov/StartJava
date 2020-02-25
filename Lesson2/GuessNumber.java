import java.util.Scanner;

public class GuessNumber {
	int guessNumber = (int)(Math.random() * 100) + 1;
	Scanner scan = new Scanner(System.in);

	public void checkEnteredNumber(int enteredNumber) {
		System.out.println("число для угадывания " +guessNumber);

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

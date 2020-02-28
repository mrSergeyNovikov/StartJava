import java.util.Scanner;

public class GuessNumber {
	
	Private Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void enteredNumbersPlayers(Player player) {
		System.out.println(player.getName() +"Введите число: ");
		player.setNumber(scan.nextInt());
	}

	public void checkEnteredNumber(Player player) {
		System.out.println("* число для угадывания * " +guessNumber);
		if (player.getNumber() == guessNumber) {
			System.out.println("Победитель!!!");
			int guessNumber = (int)(Math.random() * 100) + 1;
		} else if (player.getNumber() < guessNumber) {
			System.out.println("Введеное вами число меньше задуманного");
		} else if (player.getNumber() > guessNumber) {
			System.out.println("Введеное вами число больше задуманного ");
		}
	}
}

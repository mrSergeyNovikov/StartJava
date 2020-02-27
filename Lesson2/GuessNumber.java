import java.util.Scanner;

public class GuessNumber {
	private int guessNumber = (int)(Math.random() * 100) + 1;
	Private Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String getNamePlayers() {
		System.out.println("Введите имя первого игрока" + player1);
		String enteredName = scan.next();
		System.out.println("Введите имя второго игрока" + player2);
		String enteredName2 = scan.next();
		return enteredName;
	}

	public void enteredNumbersPlayers(Player player) {
		System.out.println(player.getName() +"Введите число: ");
	}

	public void checkEnteredNumber(Player player) {
		System.out.println("* число для угадывания * " +guessNumber);
		if (player.getNumber() == guessNumber) {
			System.out.println("Победитель!!!");
		} else if (player.getNumber() < guessNumber) {
			System.out.println("Введеное вами число меньше задуманного");
		} else if (player.getNumber() > guessNumber) {
			System.out.println("Введеное вами число больше задуманного ");
		}
	}
}

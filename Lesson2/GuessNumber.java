import java.util.Scanner;

public class GuessNumber {
    int guessNumber = (int)(Math.random() * 100) + 1;
    Scanner scan = new Scanner(System.in);
    Player player1;
    Player player2;

    public Guess(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void checkEnteredNumber() {
        int enteredNumber;

        System.out.println("число для угадывания " +guessNumber);
        enteredNumber = scan.nextInt();

        if (enteredNumber < guessNumber) {
            System.out.println("Введеное вами число меньше задуманного");
        } else if (enteredNumber > guessNumber) {
            System.out.println("Введеное вами число больше задуманного ");
        } else {
            System.out.println("Победитель!!!");
        }
    }
}

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerOnQuestion = "да";

		System.out.println("Игрок " + 1 + " введите имя: ");
		Player player1 = new Player(scan.next());
		System.out.println("Игрок " + 2 + " введите имя: ");
 		Player player2= new Player(scan.next());

		do {

		} while (answerOnQuestion.equals("да"));
		System.out.println("Пока!");
	}
}
package com.startjava.Lesson2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answerOnQuestion = "да";

		System.out.println("Игра. Угадай чило от 0 до 100...");
		System.out.println();

		System.out.println("Игрок первый" + " введите имя: ");
		Player player1 = new Player(scan.next());
		System.out.println("Игрок второй" + " введите имя: ");
		Player player2= new Player(scan.next());

		GuessNumber guessNumber = new GuessNumber(player1, player2);
		
		do {
			guessNumber.playGame();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				answerOnQuestion = scan.next();
			} while (!answerOnQuestion.equalsIgnoreCase("да") && !answerOnQuestion.equalsIgnoreCase("нет"));
		} while (answerOnQuestion.equalsIgnoreCase("да"));
		System.out.println("Пока! Спасибо за игру");
	}
}
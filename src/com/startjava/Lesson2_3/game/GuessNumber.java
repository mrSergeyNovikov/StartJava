package com.startjava.Lesson2_3.game;

import java.util.Scanner;

public class GuessNumber {

	Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;
	private boolean isWinner;
	private int guessNumber;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void playGame() {
		isWinner = true;
		guessNumber = (int)(Math.random() * 101);
		do {
			enterNumber(player1);
			checkEnteredNumber(player1);
			enterNumber(player2);
			checkEnteredNumber(player2);
		} while (isWinner);
	}

	public void enterNumber(Player player) {
		System.out.println(player.getName() +" Введите число: ");
		player.setNumber(scan.nextInt());
	}

	public void checkEnteredNumber(Player player) {
		System.out.println("* число для угадывания * " + guessNumber);
		if (player.getNumber() == guessNumber) {
			System.out.println("Победитель!!!");
			isWinner = false;
		} else if (player.getNumber() < guessNumber) {
			System.out.println("Введеное вами число меньше задуманного");
		} else if (player.getNumber() > guessNumber) {
			System.out.println("Введеное вами число больше задуманного ");
		}
	}
}

package com.startjava.Lesson1.game;

public class MyFirstGame {
// Напишите игру Угадай число:
// компьютер "загадывает" целое число от 0 до 100, которое вам необходимо угадать
// после каждой неудачной попытки выводите подсказки: 
// System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
// если число угадано — System.out.println("Вы угадали!")
// игра продолжается до тех пор, пока число не будет угадано

	public static void main(String[] args) {
		int guessNumber = 12;
		int enteredNumber = 50;

		while(enteredNumber != guessNumber ) {
			if (enteredNumber < guessNumber) {
				System.out.println("Введеное вами число меньше");
				enteredNumber++;
			} else if(enteredNumber > guessNumber) {
				System.out.println("Введеное вами число больше");
				enteredNumber--;
			}
		}	
		System.out.println("Вы угадали! Это: " + guessNumber);	
	}
}
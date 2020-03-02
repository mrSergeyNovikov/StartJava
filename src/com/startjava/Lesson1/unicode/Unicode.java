package com.startjava.Lesson1.unicode;

public class Unicode {
// Выведите в цикле символы кодировки Unicode в диапазоне [33, 126]

	public static void main(String[] args) {
		for (int i = 33;  i <= 126; i++) {
			System.out.print((char)i);
		}
	}
}
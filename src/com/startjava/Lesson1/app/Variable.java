package com.startjava.Lesson1.app;

public class Variable {

	public static void main(String[] args) {
		byte kernel = 8;
		short winVersion = 10;
		int build = 18362;
		long useTime = 12960000;
		float physicalMemory = 6.90f;
		double virtualMemory = 9.70d;
		char сomputerСopyright = 'C';
		boolean isFirewall = true;

		System.out.println("Количество ядер:" + kernel);
		System.out.println("Операционная система: " + winVersion);
		System.out.println("Сборка операционной системы Windows: " + build);
		System.out.println("Время использования компьютера(в секундах): " + useTime);
		System.out.println("Доступная физическая память: " + physicalMemory);
		System.out.println("Доступная виртуальная память: " + virtualMemory);
		System.out.println("Компьтер защищен лицензией: " + сomputerСopyright);
		System.out.println("Включенный firefall: " + isFirewall);
	}
}
package com.startjava.Lesson2_3.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger gipsyDanger = new Jaeger("gipsyDanger", "Mark-3", "Destroyed", "Blue Spark 4.1", 79.25f, 1.900f, 7, 8, 6);
// вывод информации о роботе через переопределенный метод toString()
		System.out.println(gipsyDanger);
		System.out.println("");

		gipsyDanger.move();
		gipsyDanger.dodge();
		System.out.println("");

		Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Destroyed", "Nauthlus-4 Zirca Sync", 85.34f, 2.312f, 5, 7, 4);
// вывод информации о роботе через переопределенный метод toString()
		System.out.println(coyoteTango);
		System.out.println("");

		coyoteTango.scanKaiju();
		coyoteTango.drift();
	}
}
public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Gipsy Danger", "Mark-3", "Destroyed", "Blue Spark 4.1", 79.25f, 1.900f, 7, 8, 6);
		System.out.println("Егерь: " + jaegerOne.getModelName());
		System.out.println("Модель: " + jaegerOne.getMark());
		System.out.println("Статус:" + jaegerOne.getStatus());
		System.out.println("Орерационная система: " + jaegerOne.getOs());
		System.out.println("Высота: " + jaegerOne.getHeight());
		System.out.println("Вес: " + jaegerOne.getWeight());
		System.out.println("Скорость: " + jaegerOne.getSpeed());
		System.out.println("Сила: " + jaegerOne.getStrange());
		System.out.println("Броня: " + jaegerOne.getArmor());
		System.out.println("");

		jaegerOne.move();
		jaegerOne.dodge();
		System.out.println("");

		Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Mark-1", "Destroyed", "Nauthlus-4 Zirca Sync", 85.34f, 2.312f, 5, 7, 4);
		System.out.println("Егерь: " + jaegerTwo.getModelName());
		System.out.println("Модель: " + jaegerTwo.getMark());
		System.out.println("Статус:" + jaegerTwo.getStatus());
		System.out.println("Орерационная система: " + jaegerTwo.getOs());
		System.out.println("Высота: " + jaegerTwo.getHeight());
		System.out.println("Вес: " + jaegerTwo.getWeight());
		System.out.println("Скорость: " + jaegerTwo.getSpeed());
		System.out.println("Сила: " + jaegerTwo.getStrange());
		System.out.println("Броня: " + jaegerTwo.getArmor());
		System.out.println("");

		jaegerTwo.scanKaiju();
		jaegerTwo.drift();
	}
}
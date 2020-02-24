public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Gipsy Danger");
		jaegerOne.setMark("Mark-3");
		jaegerOne.setStatus("Destroyed");
		jaegerOne.setOs("Blue Spark 4.1");
		jaegerOne.setHeight(79.25f);
		jaegerOne.setWeight(1.900f);
		jaegerOne.setSpeed(7);
		jaegerOne.setStrange(8);
		jaegerOne.setArmor(6);

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

		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Coyote Tango");
		jaegerTwo.setMark("Mark-1");
		jaegerTwo.setStatus("Destroyed");
		jaegerTwo.setOs("Nauthlus-4 Zirca Sync");
		jaegerTwo.setHeight(85.34f);
		jaegerTwo.setWeight(2.312f);
		jaegerTwo.setSpeed(5);
		jaegerTwo.setStrange(7);
		jaegerTwo.setArmor(4);
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
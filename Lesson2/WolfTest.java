public WolfTest {

	public static void main(String[] args) {
		Wolf wolf = new Wolf();

		wolf.name = "Хелсинг";
		System.out.println("Кличка: " + wolf.name);
		wolf.sex = "Волк";
		System.out.println("Пол: " + wolf.sex);
		wolf.age = 10;
		System.out.println("Возраст: " + wolf.age);
		wolf.weight = 50.3;
		System.out.println("Вес: " + wolf.weight);
		wolf.color = "Черный";
		System.out.println("Окрас: " + wolf.color);

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.earn();
		wolf.hunt();
	}
}
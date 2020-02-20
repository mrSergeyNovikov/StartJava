public class ConditionalStatement {

	public static void main(String[] args) {
		byte yourAge = 25;
		boolean isMan = true;
		float grow = 1.75f;
		char firstNameLetter = 'И';


		if(yourAge > 20) {
			System.out.println("Вы уже взрослый");
		} 

		if(isMan) { 
			System.out.println("Оказывается, вы мужчина");
		} 

		if (!isMan) {
			System.out.println("Жаль, вы не мужчина");
		}

		if(grow < 1.80) {
			System.out.println("Вы среднего роста");
		} else {
			System.out.println("Вы очень высокий");
		}

		if(firstNameLetter == 'М') {
			System.out.println("Наверно вас зовут Михаил");
		} else if(firstNameLetter == 'И') {
			System.out.println("Наверно вас зовут Игорь");
		} else {
			System.out.println("Я не заю как вас зовут");
		}
	}
}
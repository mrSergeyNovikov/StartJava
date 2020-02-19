public class ConditionalStatement {

	public static void main(String[] args) {

		byte yourAge = 25;
		boolean isMan = true;
		float yourGrow = 1.75f;
		char isNameStartWithLetter = '\u0418';


		if(yourAge > 20) {
			System.out.println("Вы уже взрослый");
		} 

		if(isMan) { 
			System.out.println("Оказывается, вы мужчина");
		} 

		if (!isMan) {
			System.out.println("Жаль, вы не мужчина");
		}

		if(yourGrow < 1.80) {
			System.out.println("Вы среднего роста");
		} else {
			System.out.println("Вы очень высокий");
		}

		if(isNameStartWithLetter == '\u041c') {
			System.out.println("Наверно вас зовут михаил");
		} else if(isNameStartWithLetter == '\u0418') {
			System.out.println("Наверно вас зовут игорь");
		} else {
			System.out.println("Я не заю как вас зовут");
		}
		
	}

}
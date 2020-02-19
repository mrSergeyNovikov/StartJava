public class Unicode {
	//Выведите в цикле символы кодировки Unicode в диапазоне [33, 126]

	public static void main(String[] args) {
		
		char simbol;

		for (int i = 33;  i < 126; i++) {
			simbol = (char)(i);
			System.out.print(simbol);
		}
	}

}
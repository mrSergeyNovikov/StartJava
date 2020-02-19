public class Calculator {
	// Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) 
	//над целыми положительными числами
    // для проверки знака математической операции воспользуйтесь оператором if else
    // выведите на экран результат работы калькулятора с помощью System.out.println()

	public static void main(String[] args) {

		int firstNumber = 10;
		int secondNumber = 20;
		char operation = '/';
		int degree = 2;
		double result = 0;
		int moduleDivision = 2;

		if(operation == '+') {
			result = firstNumber + secondNumber;
			System.out.println("Сложение... Ответ: " + result);
		}

		if(operation == '-') {
			result = firstNumber - secondNumber;
			System.out.println("Вычитание... Ответ: " + result);
		}

		if(operation == '/') {
			result = firstNumber / secondNumber;
			System.out.println("Деление... Ответ: " + result);
		}

		if(operation == '*') {
			result = firstNumber * secondNumber;
			System.out.println("Умножение... Ответ: " + result);
		}

		if(operation == '^') {
			result = firstNumber * degree;
			System.out.println("Возведение в степень первого числа... Ответ: " + result);
			result = secondNumber * degree;
			System.out.println("Возведение в степень второго числа... Ответ: " + result);
		}

		if(operation == '%') {
			result = firstNumber % moduleDivision;
			System.out.println("Деление по модулю первого числа... Ответ: " + result);
			result = result = secondNumber % moduleDivision;
			System.out.println("Деление по модулю второго числа... Ответ: " + result);
		}
		
	}

}
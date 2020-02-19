public class Circle {

	public static void main(String[] args) {
		CircleOne();
		CircleTwo();
		CircleThree();
	}

	// Выведите на консоль с помощью цикла for все числа от [0, 20]
	public static void CircleOne() {
		for (int i = 0; i <= 20 ; i++ ) {
			System.out.println("Число: " + i);
		}
	}

	// Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
	public static void CircleTwo() {
		int i = 8;
        while (i > -6) {
            i = i - 2;
            System.out.print(i + " ");
        }
	}

	// Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
	public static void CircleThree() {
		int i = 10;
		int result = 0;
		 do {
            if (i % 2 == 1) {
            	result += i;
            }
            i++;
            
        } while(i <= 20);
        System.out.println("Результат суммы нечетный чисел: " + result);
	}
	
}
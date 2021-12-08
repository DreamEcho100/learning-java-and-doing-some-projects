public class Main {

	public static void main(String[] args) {
		// Expression:
		// Operands & operators
		//
		// Operands:
		// Values, variables, numbers, quantities
		//
		// Operators:
		// +, -, *, /, %
		//
		int friends = 10;

		friends = friends - 1;
		friends -= 1;
		friends--;
		System.out.println("Friends: " + friends);

		friends = friends + 1;
		friends += 1;
		friends++;
		System.out.println("Friends: " + friends);

		friends = friends * 2;
		friends *= 2;
		System.out.println("Friends: " + friends);

		friends = friends / 1;
		friends /= 1;
		System.out.println("Friends: " + friends);

		friends = friends % 3;
		friends %= 3;
		System.out.println("Friends: " + friends);

		double number = 10;
		System.out.println("10 / 3 = " + number / 3);
		System.out.println("10 / 3 = " + (double) number / 3);
	}

}
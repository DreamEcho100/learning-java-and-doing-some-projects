import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * String number; String numberReversed = "";
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the number to reverse:"); number =
		 * scanner.nextLine();
		 * 
		 * if (number.length() > 1) { for (int i = number.length(); i > 0; i--) {
		 * numberReversed += number.substring(i - 1, i); } }
		 * 
		 * System.out.println("Number reversed: " + numberReversed);
		 * 
		 * scanner.close();
		 */

		int number, reminder, reversed = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number to reverse:");
		number = scanner.nextInt();

		while (number != 0) {
			reminder = number % 10;
			reversed = reversed * 10 + reminder;
			number /= 10;
		}

		scanner.close();
		/*
		 * int num1 = 0; int tempNum = num1; int num2 = 1;
		 * 
		 * for (int i = 0; i < 9; i++) { tempNum = num1; num1 += num2; num2 = tempNum; }
		 * 
		 * System.out.println(num1);
		 */
	}

}

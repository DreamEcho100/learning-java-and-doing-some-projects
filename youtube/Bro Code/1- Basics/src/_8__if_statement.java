import java.util.Scanner;

public class _8__if_statement {

	public static void main(String[] args) {
		// If statement:
		// Performs a block of code if it's condition evaluates to be true
		//

		int age;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a person age:");
		age = scanner.nextInt();

		scanner.nextLine();

		scanner.close();

		if (age <= 0) {
			System.out.println("Invalid Input!");
		} else if (age < 18) {
			System.out.println("Underage!");
		} else if (age < 65) {
			System.out.println("Understandable have a nice day.");
		} else if (age < 250) {
			System.out.println("Retired!");
		} else {
			System.out.println("Trolling?");
		}
	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String firstName, lastName, food;
		int age;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your first Name?");
		firstName = scanner.nextLine();
		if (firstName.length() > 1) {
			firstName = firstName.trim();
			firstName = firstName.substring(0, 1).toUpperCase()
					+ firstName.substring(1, firstName.length()).toLowerCase();
		} else {
			firstName = "none";
		}

		System.out.println("What is your last Name?");
		lastName = scanner.nextLine();
		if (lastName.length() > 1) {
			lastName = lastName.trim();
			lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length()).toLowerCase();
		} else {
			lastName = "none";
		}

		System.out.println("How old are you?");
		// age = Integer.parseInt((scanner.nextLine()));
		age = scanner.nextInt();

		scanner.nextLine();
		System.out.println("What is your favourite food?");
		food = scanner.nextLine();
		if (lastName.length() > 1) {
			food = food.toLowerCase().trim();
		} else {
			food = "none";
		}

		scanner.close();

		System.out.print("Hello " + firstName + " " + lastName);
		System.out.print(", Your age is " + age + " years old");
		System.out.print(" and your favourite food is " + food + ".");
	}

}
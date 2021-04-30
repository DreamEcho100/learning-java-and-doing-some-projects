import java.util.Scanner;

public class _9__switch_statement {

	public static void main(String[] args) {
		// Switch statement:
		// Statement that allows to be for equality against a list of values
		//

		String day;

		Scanner scanner = new Scanner(System.in);

		System.out.println("What's today in the week?:");
		day = scanner.nextLine().toLowerCase();

		scanner.close();

		switch (day) {
		case "saturday":
			System.out.println("It's Saturday!");
			break;
		case "sunday":
			System.out.println("It's Sunday!");
			break;
		case "monday":
			System.out.println("It's Monday!");
			break;
		case "tuesday":
			System.out.println("It's Tuesday!");
			break;
		case "wednesday":
			System.out.println("It's wednesday!");
			break;
		case "thursday":
			System.out.println("It's Thursday!");
			break;
		case "friday":
			System.out.println("It's Friday!");
			break;
		default:
			System.out.println("This is not a day!");
			break;

		}
	}

}
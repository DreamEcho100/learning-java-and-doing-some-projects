import java.util.Scanner;

public class _11__while_loop_and_do_while_loop {

	public static void main(String[] args) {
		// While loop:
		// Executes a block of code as long it's condition remains true
		//
		
		String name = "";
		
		Scanner scanner = new Scanner(System.in);
		
//		while (name.isBlank()) {
//			System.out.print("Enter your name: ");
//			name = scanner.next();
//		}
		
		do {
			System.out.print("Enter your name: ");
			name = scanner.next();
		} while (name.isBlank());
		
//		if(name.length() > 0) {
//			if (name.length() == 1) {
//				name = name.toUpperCase();
//			} else {
//				name = name.substring(0, 1).toUpperCase() + name.toLowerCase();
//			}
//		}
		
		System.out.println("Hello " + name);
		 

		int number, reminder, reversed = 0;

		System.out.println("Enter the number to reverse:");
		number = scanner.nextInt();

		while (number != 0) { // Won't work probably if it starts or ends with the number 0
			reminder = number % 10;
			reversed = reversed * 10 + reminder;
			number /= 10;
		}
		
		System.out.println("Number reversed: " + reversed);
		
		scanner.close();

	}

}

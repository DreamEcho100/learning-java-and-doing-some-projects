
public class _19__printf {

	public static void main(String[] args) {
		// printf():
		// - An optional method to control, format and display text to the console window
		// - two arguments = format string + (object/variable/value)
		// % [flag] [precision] [width] [conversion-character]
		//

		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInteger = 50;
		double myDouble = 1000.0;
		
		System.out.printf("This is a format string %d.", 123);
		System.out.println();
		
		// [conversion-character]
		System.out.printf("%d, this is a format string.", 123);
		System.out.println();

		System.out.printf("%b", myBoolean);
		System.out.println();
		System.out.printf("%c", myChar);
		System.out.println();
		System.out.printf("%s", myString);
		System.out.println();
		System.out.printf("%d", myInteger);
		System.out.println();
		System.out.printf("%f", myDouble);
		System.out.println();
		
		// [width]:
		// - Minimum number of characters to be written as output.
		//
		System.out.printf("Hello %10s", myString);
		System.out.println();
		System.out.printf("Hello %-10s", myString);
		System.out.println();
		System.out.printf("Hello %2s", myString);
		System.out.println();
		
		// [precision]:
		// - Sets number of digits when outputting floating-point values
		// 
		System.out.printf("You have this much money %.2f", myDouble);
		System.out.println();
		
		// [flag]
		// - Adds an effect to output based on the flag added to format specifier.
		// (-): left-justify
		// (+): output a plus based on the flag added to format specifier
		// (0): numeric values are zero-padded
		// (,): comma grouping separator if numbers < 1000
		//
		System.out.printf("You have this much money %-20f", myDouble);
		System.out.println();
		System.out.printf("You have this much money %20f", myDouble);
		System.out.println();
		System.out.printf("You have this much money %+f", myDouble);
		System.out.println();
		System.out.printf("You have this much money %020f", myDouble);
		System.out.println();
		System.out.printf("You have this much money %,f", myDouble);
		System.out.println();

	}

}
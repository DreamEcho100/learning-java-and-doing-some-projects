
public class _20__final_keyword {

	public static void main(String[] args) {
		
		// Anything with the (final) keyword can't be changed or updated.
		// Common good practice is to make the variable name all upper-case
		
		final double PI = 3.14159;
		
		// PI = 22 / 7;
		// Will lead to an error
		// The final local variable PI cannot be assigned. It must be blank and not using a compound assignment.
		
		System.out.println(PI);

	}

}
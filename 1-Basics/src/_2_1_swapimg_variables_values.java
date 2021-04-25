
public class _2_1_swapimg_variables_values {

	public static void main(String[] args) {
		String x = "water";
		String y = "Kool-Aid";
		String temp;

		System.out.println("Before Swaping...");
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		temp = x;
		x = y;
		y = temp;

		System.out.println();

		System.out.println("After Swaping...");
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}

package _2_variables_and_swapimg_variables_values_in_java;

public class Main {

	public static void main(String[] args) {
		byte v = -126;
		long w = 12345678987654321L;
		int x = 123;
		float y = 3.14f;
		double xDividedByY = (x / y) + (w % v);
		boolean z = true;
		char symbol = '@';
		String name = "Bro";

		System.out.println(
				"Hello " + name + symbol + "(" + x + "/" + y + ")+(" + w + "%" + v + ")" + "=" + xDividedByY + "." + z);
		
		//

		String a = "water";
		String b = "Kool-Aid";
		String temp;

		System.out.println("Before Swaping...");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println();

		System.out.println("After Swaping...");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}

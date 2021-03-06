import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a = 3.14;
		double b = -10;
		double x, y, z;

		Scanner scanner = new Scanner(System.in);

		System.out.println("| a: " + a + " | b: " + b + " | max (a, b): " + Math.max(a, b) + " |");
		System.out.println("| a: " + a + " | b: " + b + " | max (a, b): " + Math.min(a, b) + " |");

		System.out.println("| a: " + a + " | b: " + b + " | round (a): " + Math.round(a) + " |");
		System.out.println("| a: " + a + " | b: " + b + " | floor (a): " + Math.floor(a) + " |");
		System.out.println("| a: " + a + " | b: " + b + " | ceil (a): " + Math.ceil(a) + " |");

		System.out.println("| a: " + a + " | b: " + b + " | abs (b): " + Math.abs(b) + " |");

		System.out.println(
				"| a: " + a + " | b: " + b + " | pow(a^b): " + Math.pow(a, b) + " | pow(b^-3): " + Math.pow(b, -3));

		System.out.println("Enter side x:");
		x = scanner.nextDouble();

		System.out.println("Enter side y:");
		y = scanner.nextDouble();

		z = Math.sqrt((x * x) + (y * y));

		System.out.println("The hypotenuse is : " + z);

		scanner.close();
	}

}
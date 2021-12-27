import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z;
		
		try {
			System.out.print("Enter an integer to divide");
			x = scan.nextInt();

			System.out.print("Enter an integer to divide by except zero");
			y = scan.nextInt();
			
			z = x / y;
			
			System.out.println("The result: " + z);
		} catch(ArithmeticException e) {
			System.out.println("I told you to not choose zero bakaaaaaaaaaaa!!!");
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("I told you to enter an integer bakaaaaaaaaaaa!!!");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Error, bakaaaaaaaaaaa!!!");
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}

}

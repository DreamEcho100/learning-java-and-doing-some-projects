
public class _13__arraya {

	public static void main(String[] args) {
		// Arrays:
		// Used to store multiple values in a single variable
		// 
		String[] cars = { "Camaro", "Corvette", "Tesls" };
		
		System.out.println(cars[0]);
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		System.out.println(cars.length);
		
		System.out.println(cars);
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}

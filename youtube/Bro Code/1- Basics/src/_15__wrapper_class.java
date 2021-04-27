
public class _15__wrapper_class {

	public static void main(String[] args) {
		// Wrapper class:
		// Provides a way to use primitive data types as reference data types
		//
		// Reference data types contain useful methods
		// wrapper class can be used with collections (ex.ArrayList)

		// Primitive       // Wrapper
		// ----------      // ----------
		// boolean         // Boolean
		// char            // Character
		// int             // Integer
		// double          // Double

		// Autoboxing:
		// The automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class
		// 
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bro";

		// Unboxing:
		// The reverse of autoboxing
		// automatic conversion that the Java compiler makes between wrapper class to the primitive
		// 

		System.out.println(a == true);
		System.out.println(b == '@');
		System.out.println(c == 123);
		System.out.println(d == 3.14);
		System.out.println(e == "Bro");
		
	}

}

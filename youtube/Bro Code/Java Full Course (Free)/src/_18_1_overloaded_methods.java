
public class _18_1_overloaded_methods {

	public static void main(String[] args) {
		// Overloaded methods:
		// methods that share the same name but have different parameters.
		// This is allowed because each method has it's own unique method signature = method name + method parameters.
		// 

		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		System.out.println(add(1, 2, 3, 4));
		System.out.println(add(1.0, 2.0, 3.0, 4.0, 5.0));
		System.out.println(add(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));
		System.out.println(add(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0));

	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	
	static double add(double a, double b, double c, double d, double e) {
		System.out.println("This is overloaded method #4");
		return a + b + c + d + e;
	}
	
	static double add(double a, double b, double c, double d, double e, double f) {
		System.out.println("This is overloaded method #5");
		return a + b + c + d + e + f;
	}
	
	static double add(double a, double b, double c, double d, double e, double f, double g) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d + e + f + g;
	}

}
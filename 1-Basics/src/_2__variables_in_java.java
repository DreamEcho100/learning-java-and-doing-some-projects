
public class _2__variables_in_java {

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
	}

}

import java.util.Random;

public class _7__random_class {

	public static void main(String[] args) {
		Random random = new Random();

		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		System.out.println(random.nextBoolean());
	}

}
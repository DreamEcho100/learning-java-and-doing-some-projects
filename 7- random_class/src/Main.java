import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		System.out.println(random.nextBoolean());
	}

}
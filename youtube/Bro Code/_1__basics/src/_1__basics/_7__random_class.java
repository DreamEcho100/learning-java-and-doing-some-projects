package _1__basics;

import java.util.Random;

public class _7__random_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		System.out.println(random.nextInt(6) + 1);
		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		System.out.println(random.nextBoolean());
	}

}
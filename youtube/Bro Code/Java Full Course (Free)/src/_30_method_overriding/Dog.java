package _30_method_overriding;

public class Dog extends Animal {
	@Override
	void speak() {
		System.out.println("The dog goes *bark*.");
	}
}

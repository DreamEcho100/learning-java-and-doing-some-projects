package _31_super_keyword;

public class Main {

	public static void main(String[] args) {
		Hero hero1 = new Hero("Bruc Wayne", 43, "Batman", "$$$");
		Hero hero2 = new Hero("Klark Kent", 42, "Superman", "everything");

		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
	}

}

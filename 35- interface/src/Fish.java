
public class Fish implements PreyInterface, PredatorInterface {

	@Override
	public void flee() {
		System.out.println("The fish is fleeing!");
	}

	@Override
	public void hunt() {
		System.out.println("The fish is hunting!");
	}

}

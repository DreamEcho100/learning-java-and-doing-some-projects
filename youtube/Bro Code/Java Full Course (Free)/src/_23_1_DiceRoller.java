import java.util.Random;

public class _23_1_DiceRoller {


	// Global methods:
	Random random = new Random();
	int number;
	
	_23_1_DiceRoller() {
//		// Local methods:
//		Random random = new Random();
//		int number = 0;
//		roll(random, number);
		
		// Local methods:
		random = new Random();
		roll();
	}
	
//	void roll(Random random, int number) {
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}

}

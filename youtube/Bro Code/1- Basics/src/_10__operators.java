import java.util.Scanner;

public class _10__operators {

	public static void main(String[] args) {
		// Logical operators:
		// used to connect two or more expressions
		//
		// && = (AND) both conditions must be true
		// || = (OR) either condition must be true
		// ! = (NOT) reverse boolean va;ue of condition
		
		String response;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("You are playing a game! Press (q) or (Q) to quit: ");
		response = scanner.next();

		System.out.println(response.equals("q"));
		System.out.println(response.equals("Q"));
		System.out.println(response.equals("q") || response.equals("Q"));
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game!");
		} else {
			System.out.println("You are still playing the game *pew pew laser gun*");
		}
		
//		if(!response.equals("q") && !response.equals("Q")) {
//			System.out.println("You are still playing the game *pew pew laser gun*");
//		} else {
//			System.out.println("You quit the game!");
//		}
		
//		if(!response.equals("q") && !response.equals("Q")) {
//			System.out.println("You are still playing the game *pew pew laser gun*");
//		} else {
//			System.out.println("You quit the game!");
//		}
		
//		if(response.equalsIgnoreCase("q")) {
//			System.out.println("You quit the game!");
//		} else {
//			System.out.println("You are still playing the game *pew pew laser gun*");
//		}
		
		scanner.close();

	}

}

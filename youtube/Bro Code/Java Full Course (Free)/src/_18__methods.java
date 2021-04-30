
public class _18__methods {
 
	public static void main(String[] args) {
		// Method:
		// A block of code that is executed whenever it is called upon.

		int x = 3;
		int y = 4;
		
		int z = add(x, y);
		
		System.out.println(z);

	    System.out.println(middleChar("Liam"));
	    System.out.println(middleChar("Jenny"));
	    System.out.println(middleChar("Anja"));
	    System.out.println(middleChar(""));
	    System.out.println(middleChar("AI"));
	}
	
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	  static String middleChar(String text) {
		int startPosition;
		int finalPosition;
		if(text.length() == 0) {
		    return "";
		} else if(text.length() <= 2) {
		    return text;
		} else {
		    if(text.length() % 2 == 0) {
		        startPosition = text.length() / 2 - 1;
		        finalPosition = startPosition + 2;
		    } else {
		        startPosition = text.length() / 2;
		        finalPosition = startPosition + 1;
		    }
		    return text.substring(startPosition, finalPosition);
		}

	  }

}
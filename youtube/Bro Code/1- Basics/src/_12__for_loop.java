import java.util.Scanner;

public class _12__for_loop {

	public static void main(String[] args) {

		  String number; String numberReversed = "";
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Enter the number to reverse:"); 
		  number = Integer.toString(scanner.nextInt());
		  
		  if (number.length() > 0) {
			  if(number.length() == 1) {
				  numberReversed = number;
			  } else {
				  for (int i = number.length(); i > 0; i--) {
					  numberReversed += number.substring(i - 1, i); 
				  } 
			  }
		  }
		  
		  System.out.println("Number reversed: " + numberReversed);
		  
//			  int num1 = 0; int tempNum = num1; int num2 = 1;
//			  
//			  for (int i = 0; i < 9; i++) { 
//				  tempNum = num1;
//				  num1 += num2;
//				  num2 = tempNum;
//			  }
//			  
//			  System.out.println(num1);
			 
		  
//		  int num1, tempNum, num2, rounds;
//		  System.out.println("Enter the number to fibonacci it :P:");
//		  num1 = scanner.nextInt();
//		  tempNum = num1;
//		  num2 = num1 + num1;
//
//		  System.out.println("How many rounds?");
//		  rounds = scanner.nextInt();
//		  
//		  for (int i = 0; i < rounds; i++) { 
//			  tempNum = num1;
//			  num1 += num2;
//			  num2 = tempNum;
//		  }
//		  
//		  
//		  System.out.println(num1);

		  //
		  
		  int n, a = 0, b = 0, c = 1;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter value of n:");
	        n = s.nextInt();
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
//	            System.out.println(i);
	        }
	        
            System.out.println("\n" + a);
		  
		  scanner.close();
			 

	}

}

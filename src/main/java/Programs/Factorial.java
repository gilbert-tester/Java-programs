package Programs;

import java.util.Scanner;
// Factorial only works with positive number
//5! = 5 x 4 x 3 x 2 x 1 (multiplication from 5)

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num, fact = 1;
		
		System.out.print("Enter a positive number : ");
		num = scan.nextInt();
	
		for (int i = num; i >= 1; i-- ) {
			
			fact = fact * i;
		}	
	System.out.println("Factorial of : "+num +" = "+ fact);
	
	
	
	}

}

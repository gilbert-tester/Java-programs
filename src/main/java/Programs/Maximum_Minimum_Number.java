package Programs;

import java.util.Scanner;

public class Maximum_Minimum_Number {

	public static void main(String[] args) {
		System.out.println("Print the maximum and the minimum number.." );
		Scanner scan2 = new Scanner (System.in);
		int number1 , number2, number3, maximunNumber, minimumNumber;

		System.out.print("Enter first Number number... : " );
		number1 = scan2.nextInt();
		System.out.print("Enter second Number number... : " );
		number2 = scan2.nextInt();
		System.out.print("Enter third Number number... : " );
		number3 = scan2.nextInt();

		maximunNumber = maximunNumber (number1, number2, number3);

		minimumNumber = minimumNumber (number1, number2, number3);

		System.out.println("Maximum number is : " + maximunNumber);
		System.out.println("Minimun number is : " + minimumNumber + "\n");

	}

	private static int maximunNumber(int number1, int number2, int number3) {

		int maximunNumber = 0;

		for (int i = 1; i <= 3; i++) {

			if (number1 > number2 && number1 > number3) 
				maximunNumber = number1;
			if (number2 > number1 && number2 > number3) 
				maximunNumber = number2;
			if (number3 > number1 && number3 > number2) 
				maximunNumber = number3;

		} return maximunNumber;
	}
	private static int minimumNumber(int number1, int number2, int number3) {
		int minimumNumber = 0;

		for (int i = 1; i <= 3; i++) {

			if (number1 < number2 && number1 < number3) 
				minimumNumber = number1;
			if (number2 < number1 && number2 < number3) 
				minimumNumber = number2;
			if (number3 < number1 && number3 < number2) 
				minimumNumber = number3;


		} return minimumNumber;
	} 
	}



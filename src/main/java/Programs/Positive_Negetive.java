package Programs;

import java.util.Scanner;

public class Positive_Negetive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("Enter any integer: ");
		num = sc.nextInt();

		if (num > 0) {

			System.out.println(num + " is a positive Number");

		} else if (num <0){

			System.out.println(num + " is a negetive number");
		}
		
		else {
			
			System.out.println(num + " equal to zero!");
		}

	}

}

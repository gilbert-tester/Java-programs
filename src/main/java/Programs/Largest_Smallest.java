package Programs;

import java.util.Scanner;

public class Largest_Smallest {

	public static void main(String[] args) {

		// int num1, num2, largest, smallest;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any series of number :");
		int largest = sc.nextInt();
		int smallest = sc.nextInt();

		while (sc.hasNextInt()) {

			int input = sc.nextInt();
			//int input = sc.nextInt();
			if (input > largest || input < smallest) {
				largest = input;
				smallest = input;
			}

		}
		System.out.println(largest + " is the largest number");
		System.out.println(smallest + " is the smallest number");

		
		/*System.out.println("Enter any series of number :");
		int smallest = sc.nextInt();

		while (sc.hasNextInt()) {

			int input = sc.nextInt();
			if (input < smallest) {
				smallest = input;
			}

		}
		System.out.println(smallest + " is the smallest number");*/
	}

}

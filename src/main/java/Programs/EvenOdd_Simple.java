package Programs;

import java.util.Scanner;

public class EvenOdd_Simple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter any positive number : ");

		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Even");
		}

		else {

			System.out.println("Odd");
		}

	}

}

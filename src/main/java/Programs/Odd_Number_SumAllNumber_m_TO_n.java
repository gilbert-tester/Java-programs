package Programs;

import java.util.Scanner;

// Print sum of all the numbers from 1 - 10
public class Odd_Number_SumAllNumber_m_TO_n {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		int m, n;
		System.out.print("Enter initial number : ");
		m = scan.nextInt();

		System.out.print("Enter final number : ");
		n = scan.nextInt();

		for (int i = m; i <= n; i++) {
			if (i % 2!= 0) {// formula for getting even number
				sum = sum + i;
				System.out.print("  " + i);
			}
		}
		System.out.println();
		System.out.println("The sum is : " + sum);

	}
}

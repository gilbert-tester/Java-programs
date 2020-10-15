package Programs;

import java.util.Scanner;
// Prime Number is a natural number greater than 1 that has no positive divisors other than 1 and itself
// you can not divide with 0 or 1 or the number you are try to find out that is prime or not
// in example 5, you can divide 5 by 2, 3, and 4
// 2,3,5,7,11,13,17,19 is prime number
// 6, 8,9 12,14,15 is not prime number

public class Prime_Number_m_to_n {

	public static void main(String[] args) {

		int m, n, count = 0, totalPrime = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter initial number : ");
		m = input.nextInt();

		System.out.print("Enter ending number : ");
		n = input.nextInt();

		for (int i = m; i <= n; i++) {
			for (int j = 2; j <= i - 1; j++) {

				if (i % j == 0) {

					count++;
					break;

				}
			}

			if (count == 0) {

				System.out.println(i);
				totalPrime++;
			}

			count = 0;

		}

		System.out.println("Total prime number = " + totalPrime);

	}
}

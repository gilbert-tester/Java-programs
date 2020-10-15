package Programs;

import java.util.Scanner;
// Prime Number is a natural number greater than 1 that has no positive divisors other than 1 and itself
// you can not divide with 0 or 1 or the number you are try to find out that is prime or not
// in example 5, you can divide 5 by 2, 3, and 4
// 2,3,5,7,11,13,17,19 is prime number
// 6, 8,9 12,14,15 is not prime number

public class Prime_Number_m_to_n {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		int count = 0;

		System.out.print("Enter positive intiger : ");
		num = input.nextInt();

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				count++;
				break;
			}

		}

		if (count == 0) {
			System.out.println("Prime number");

		} else {
			System.out.println("Not prime");

		}

	}

}

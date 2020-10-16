package Programs;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");

		int sum = 0, r, temp, num;

		num = sc.nextInt();

		temp = num;

		while (temp != 0) {
			r = temp % 10;
			sum = sum + r;
			temp = temp / 10;

		}
		System.out.println("Su of Digits : " + sum);

	}

}

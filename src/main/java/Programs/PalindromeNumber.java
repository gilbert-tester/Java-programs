package Programs;

// Palindrome means same number after reversing.. example.. 
// 11 or 44 or 12121 is palindrome number
// 34 or 56 or 12345 is not palindrome number
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");

		int sum = 0, r, temp, num;

		num = sc.nextInt();

		temp = num;

		while (temp != 0) {
			r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;

		}

		if (num == sum) {
			System.out.println(num + " is palindrome number.");
		} else {

			System.out.println(num + " is not  palindrome number.");
		}

	}
}

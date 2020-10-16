package Programs;

import java.util.Scanner;

public class Capital_SmallLeter {

	public static void main(String[] args) {

		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any letter : ");
		ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is small letter.");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is capital letter.");
		} else {
			System.out.println("Not a letter.");
			
		}

	}

}

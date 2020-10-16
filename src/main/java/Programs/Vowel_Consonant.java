package Programs;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {

		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any letter : ");
		ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
			System.out.println("Vowel");
		}else if (ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O'|| ch == 'U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
			
		}
			
	}

}

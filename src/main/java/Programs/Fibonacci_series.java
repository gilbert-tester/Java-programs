package Programs;
//Fibonacci series numbers.. 0 1 1 2 3 5 8 13 21

import java.util.Scanner;

// 0+1=1, 1+2 = 3, 2+3 = 5, 3 +5 =8, 5+8 =13

public class Fibonacci_series {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers : ");
		int n = input.nextInt();
		
		int first = 0;
		int second = 1;
		int fibo;
		
		System.out.println(first+" " + second);
		for (int i = 3; i <=n; i++) {
			
			fibo = first + second;
			
			System.out.println(" "+ fibo);
			first = second;
			second = fibo;
			
		}
		
		System.out.println();
	}

}

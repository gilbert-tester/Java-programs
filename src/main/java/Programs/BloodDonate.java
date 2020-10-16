package Programs;

import java.util.Scanner;

public class BloodDonate {

	public static void main(String[] args) {

		int age;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		age = sc.nextInt();

		int weight;

		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter Weight : ");
		weight = sc.nextInt();
		
		if (age >=18) {
			if (weight>45) {
				
				System.out.println("You are eligible for donating blood");
			}else  {
				
				System.out.println("You are not eligible to donate blood");
			}
				
		}else
	
		{
		System.out.println("Age must me greter than 18");	
		}

	}

}

package Programs;

import java.util.Scanner;

public class CircleOfRadius {
	public static void main(String[] args) {
		CircleOfRadius();
	}

	public static void CircleOfRadius() {
		Scanner scan1 = new Scanner (System.in);
		int radius;
		System.out.print("Enter the radius ... : ");
		radius = scan1.nextInt();
		System.out.println("Circumference is "+ (2*3.14*radius)+ " and area is "+ (3.14*radius*radius));
	}
}

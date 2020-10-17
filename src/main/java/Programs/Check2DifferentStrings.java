package Programs;

import java.util.Objects;

public class Check2DifferentStrings {

	public static void main(String[] args) {

		String s1 = new String("God is Good");
		String s2 = new String("All the time");
		String s3 = new String("God is Good");

		System.out.println("Equality check " + s1 + " and " + s2 + " --> " + Objects.equals(s1, s2));
		System.out.println("Equality check " + s2 + " and " + s3 + " --> " + Objects.equals(s2, s3));
		System.out.println("Equality check " + s3 + " and " + s1 + " --> " + Objects.equals(s3, s1));

	}

}

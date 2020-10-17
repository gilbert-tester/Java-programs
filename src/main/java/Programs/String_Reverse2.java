package Programs;

public class String_Reverse2 {

	public static void main(String[] args) {

		String a = "Hallelujah";
		
		StringBuilder sb = new StringBuilder(a);
		sb = sb.reverse();
		System.out.println("Reverse of Hallelujah .... "+ sb);
		
	}

}

package Programs;

public class RemoveSpaceString {

	public static void main(String[] args) {

		String sg = "         Hello      Everyone       ";

		System.out.println(sg.trim().replace("      ", " "));
		
	}

}

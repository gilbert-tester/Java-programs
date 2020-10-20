package Programs;
// Write a program to find any letter all ‘e’ 
// from United State of America or from any String?

public class Find_Any_Letter {

	public static void main(String[] args) {

		String country = new String ("United State of America");
		for (int i = 0; i < country.length(); i++){
			if(country.charAt(i)=='e') {
				//System.out.println(country.charAt(i));
			System.out.println("index of e = " + i);
			
			
			}
			
		}
		
		
		
	}

}

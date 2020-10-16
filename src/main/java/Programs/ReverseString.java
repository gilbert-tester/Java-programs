package Programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ABC";
		
		ReverseString obj = new ReverseString();
		
		System.out.println(obj.stringReverse(str));
	
		char c[] = str.toCharArray();
	}
	
	public String stringReverse(String str) {
		
		if(str.length()==1) {
			return str;
		}
		
		int len = str.length();
		String rev = "";
		for (int i = len-1; i >=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		return rev;
		
	}

}

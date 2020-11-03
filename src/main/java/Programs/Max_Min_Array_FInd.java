package Programs;

import java.util.Arrays;

public class Max_Min_Array_FInd {

	public static void main(String[] args) {

		
		int a[] = {2,5,3,7,8};
		
		int minNum = Arrays.stream(a).min().getAsInt();
		int maxNum = Arrays.stream(a).max().getAsInt();
		
		System.out.println(minNum);
		System.out.println(maxNum);
	}

}

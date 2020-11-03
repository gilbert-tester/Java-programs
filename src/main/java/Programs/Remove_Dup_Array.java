package Programs;

import java.util.HashSet;
import java.util.Set;

public class Remove_Dup_Array {

	public static void main(String[] args) {

		int arr[] = {22,22,33,33,44,44,55,55,66,66,78};
		
		Set<Integer>set = new HashSet<Integer>();
	for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
		System.out.println(set);
		
	}

}

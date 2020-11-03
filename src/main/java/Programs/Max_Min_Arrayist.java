package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max_Min_Arrayist {

	public static void main(String[] args) {

		List<Integer> number = new ArrayList<>();

		number.add(4);
		number.add(10);
		number.add(2);

		Object max = Collections.max(number);
		Object min = Collections.min(number);

		System.out.println(max);
		System.out.println(min);

	}

}

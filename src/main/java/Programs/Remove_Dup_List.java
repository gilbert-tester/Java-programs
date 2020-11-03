package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Dup_List {

	public static void main(String[] args) {

		List <String> listAll = Arrays.asList("Gilbert", "Hubert", "Gilbert","Shiplu", "Shawon");
		//Create a list with the distinct elements using stream
		
		List<Object>listDistinct = 
				listAll.stream().distinct().collect(Collectors.toList());
		
		System.out.println(listDistinct);
		
	}

}

package Programs;

public class WholeStringIntoSmallString {

	public static void main(String[] args) {

		String fruit = ("Cerry, Lichi, Mango, Strawberry, Grapes");
		String [] fruitSplit = fruit.split(", ");

		for (int i = 0; i < fruitSplit.length; i++) {
			System.out.println(fruitSplit[i]);
		}
		
	}

}

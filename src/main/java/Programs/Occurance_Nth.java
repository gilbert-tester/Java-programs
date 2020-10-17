package Programs;

public class Occurance_Nth {

	public static void main(String[] args) {

		String str1 = "God is good all the time and all the time God is good.";
		String str2 = "o";
		int n = 3;

		int index = nthOccurrence(str1, str2, n, true);
		System.out.println("index of str2 in str1 at occurance " + n + " = " + index);

	}

	public static int nthOccurrence(String str1, String str2, int n, boolean ignoreCase) {

		if (ignoreCase) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
		}

		String tempStr = str1;
		int tempIndex = -1;
		int finalIndex = 0;

		for (int occurance = 0; occurance < n; ++occurance) {
			tempIndex = tempStr.indexOf(str2);
			if (tempIndex == -1) {
				finalIndex = 0;
				break;
			}
			tempStr = tempStr.substring(++tempIndex);
			finalIndex += tempIndex;

		}
		return --finalIndex;
	}

}

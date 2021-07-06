package Questions;

public class AllStringPermutations {

	private static void permutation(String str, int start, int end) {
		if (start == end) {
			// System.out.println("("+start+","+end+")");

			System.out.println(str);
			return;

		} else {
			for (int i = start; i <= end; i++) {
				// System.out.println("("+start+","+i+")");
				str = swap(str, start, i);
				permutation(str, start + 1, end);
				str = swap(str, i, start);

			}
		}
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	
	
	// easy to understand
	private static void permutation2(String str, String asf) {
		
	if(str.length()==0) {
		System.out.println(asf);
		return;
	}

		for (int i = 0; i <= str.length()-1; i++) {

			char ch= str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			permutation2(ros,asf+ch);
		}

	}

	public static void main(String[] args) {

		String input = "abc";
		int n = input.length();
		//permutation(input, 0, n - 1);

		permutation2(input, "");
	}

}

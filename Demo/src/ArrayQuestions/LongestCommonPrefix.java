package ArrayQuestions;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String arr[] = { "flower", "fl", "flight" };
		String res = find(arr);
		System.out.println(res);
	}

	private static String find(String[] arr) {
		// TODO Auto-generated method stub

		if (arr.length == 0)
			return "";

		String longestComonPrefix = "";

		int index = 0;
		for (char c : arr[0].toCharArray()) {

			for (int i = 1; i < arr.length; i++) {

				if (arr[i].length()-1 < index || c != arr[i].charAt(index)) {
					return longestComonPrefix;
				}
			}
			longestComonPrefix += c;
			index++;

		}

		return longestComonPrefix;
	}
}

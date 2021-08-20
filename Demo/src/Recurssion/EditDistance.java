package Recurssion;

public class EditDistance {
	public static void main(String[] args) {
		String word1 = "sunday", word2 = "saturday";
		int res = find(word1, word2, 0, 0);
		System.out.println(res);
	}

	static int find(String word1, String word2, int index1, int index2) {

		int res = 0;
		if (word1.length() == 0) {
			return word2.length();
		}

		if (word2.length() == 0) {
			return word1.length();

		}

		if (word1.charAt(index1) == word2.charAt(index2)) {
			res = find(word1.substring(index1 + 1), word2.substring(index2 + 1), index1, index2);
		} else {
			int replace = find(word1.substring(index1 + 1), word2.substring(index2 + 1), index1, index2);
			int delete = find(word1.substring(index1 + 1), word2.substring(index2), index1, index2);
			int insert = find(word1.substring(index1), word2.substring(index2 + 1), index1, index2);
			res = Math.min(Math.min(replace, delete), insert) + 1;

		}
		return res;

	}
}

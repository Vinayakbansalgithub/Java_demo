package Recurssion;

public class EditDistance {
	public static void main(String[] args) {
		String word1 = "horse", word2 = "ros";
		int res = find(word1, word2);
		System.out.println(res);
	}

	static int find(String word1, String word2) {

		int res = 0;
		if (word1.length() == 0) {
			return word2.length();
		}

		if (word2.length() == 0) {
			return word1.length();

		}

		if (word1.charAt(0) == word2.charAt(0)) {
			res = find(word1.substring(1), word2.substring(1));
		} else {
			int replace = find(word1.substring(1), word2.substring(1));
			int delete = find(word1.substring(1), word2);
			int insert = find(word1, word2.substring(1));
			res = Math.min(Math.min(replace, delete), insert) + 1;

		}
		return res;

	}
}

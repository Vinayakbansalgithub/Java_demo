package Questions;

import java.util.HashMap;
import java.util.Scanner;

// leetcode 205
public class IsomorphicStrings {

	static boolean find(String s1, String s2) {

		HashMap<Character, Character> c2c = new HashMap<Character, Character>();

		if (s1.length() != s2.length())
			return false;

		for (int i = 0; i < s1.length(); i++) {

			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (c2c.containsKey(c1)) {
				if (c2 != c2c.get(c1)) {
					return false;
				}
			} else {
				c2c.put(c1, c2);
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		String s1 = scan.nextLine();
//		String s2 = scan.nextLine();

		boolean res = find("paper", "title");
		System.out.println(res);

	}

}

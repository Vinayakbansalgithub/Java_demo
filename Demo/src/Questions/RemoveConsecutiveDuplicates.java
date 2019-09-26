package Questions;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	static String convert(String str, String string, String output) {
		// base case
		if (str.length() == 1) {
			output += str;
			return output;
		}
		// base case
		if (str.isEmpty()) {
			return output;
		}

		if (str.charAt(0) == str.charAt(1)) {
			output += str.charAt(0);
			char c = str.charAt(0);
			while (!str.isEmpty() && c == str.charAt(0)) {
				str = str.substring(1);
			}
			output = convert(str, "", output);

		} else {
			output += str.charAt(0);
			output = convert(str.substring(1), "", output);

		}
		return output;
	}

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		String str = scanner.nextLine().trim();

		String output = convert("aaaaaaaaaaaaaaaaaaabc", "", "");
		System.out.println(output);
	}
}

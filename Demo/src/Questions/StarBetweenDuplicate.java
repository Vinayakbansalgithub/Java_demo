package Questions;

import java.util.Scanner;


// pending
public class StarBetweenDuplicate {

	static String convert(String str, String output) {
		if (str.length() == 1) {
			output += str;
			return output;
		}
		if (str.charAt(0) == str.charAt(1)) {
			output += str.charAt(0) + "*";
		} else {
			output += str.charAt(0) + "";
		}
		output = convert(str.substring(1), output);
		return output;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();

		String output = convert(str, "");
		System.out.println(output);
	}

}

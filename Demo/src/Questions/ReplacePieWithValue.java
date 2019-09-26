package Questions;

import java.util.Scanner;

public class ReplacePieWithValue {
	static String convert(String str, String output) {
		if (str.length() == 1 || str.isEmpty()) {
			return output + str;
		}
		
		if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
			output += "3.14";
			output = convert(str.substring(2), output);

		} else {
			output += str.charAt(0);
			output = convert(str.substring(1), output);
		}

		return output;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int tc = Integer.parseInt(scanner.nextLine().trim());
		for (int i = 0; i < tc; i++) {
			String value = scanner.nextLine().trim();
			String output = convert(value, "");
			System.out.println(output);
		}
	}
}

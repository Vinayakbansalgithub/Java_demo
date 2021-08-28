package Questions;

import java.util.Scanner;


// pending
public class StringToInteger {
	static int convert(String str, int output) {
		if (str.isEmpty()) {
			return output;
		}
		char c = str.charAt(0);
		output = output * 10 + Integer.parseInt(c + "");
		output = convert(str.substring(1), output);

		return output;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().trim();

		int output = convert(str, 0);
		System.out.println(output);
	}

}

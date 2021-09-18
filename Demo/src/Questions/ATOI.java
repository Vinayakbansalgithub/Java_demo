package Questions;

import java.util.Scanner;

public class ATOI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		int result = find(input);

		System.out.println(result);
	}

	static int find(String input) {

		char arr[] = input.toCharArray();
		int result = 0;

		for (char c : arr) {

			int temp = c - '0';
			if (temp >= 0 && temp <= 9) {

				result = result * 10 + temp;
			} else
				return -1;

		}

		return result;
	}
}

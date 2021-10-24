package Questions;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		// 9 4 9 6 7 4
		int resultIndex = find(input);
		System.out.println(input.charAt(resultIndex));
	}

	static int find(String str) {
		int[] cArr = new int[256];

		for (int c : str.toCharArray()) {

			cArr[c]++;
		}

		int index = -1;

		for (int i = 0; i < cArr.length; i++) {
			System.out.println("i is " + i);

			if (cArr[str.charAt(i)] == 1) {
				index = i;
				return index;
			}
		}

		return index;

	}
}

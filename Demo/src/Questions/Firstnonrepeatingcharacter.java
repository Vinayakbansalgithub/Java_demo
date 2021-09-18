package Questions;

import java.util.Scanner;

public class Firstnonrepeatingcharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

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

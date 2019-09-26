package Recurssion;

import java.util.Arrays;

public class PrintSubSequence {

	static void getSubSequence(String input, String output) {
		if (input.length() == 0) {
			System.out.println("value:"+output);
			return;
		}
		getSubSequence(input.substring(1), output);
		getSubSequence(input.substring(1),  output+input.charAt(0));
	}

	public static void main(String[] args) {

		String str = "abc";
		getSubSequence(str, "");

	}

}

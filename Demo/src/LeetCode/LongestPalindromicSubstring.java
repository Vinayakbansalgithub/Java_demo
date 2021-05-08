
package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

//  Manacher's Algorithm 
class LongestPalindromicSubstring {

	static int[] arr;
	static String palindromstring;
	static int counter;
	static int highestindex = 0;
	static int highest;

	static void longest(char[] str, int length) {

		arr = new int[length];
		arr[0] = 1;
		arr[length - 1] = 1;
		for (int i = 1; i < str.length - 1; i++) {
			counter = 1;

			int iiiiiiiiiiii = i;
			int right = i;
			while (iiiiiiiiiiii > 0 && right < arr.length && str[--iiiiiiiiiiii] == str[++right]) {
				counter = counter + 2;

			}

			arr[i] = counter;

		}
		highest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > highest) {
				highest = arr[i];
				highestindex = i;
			}

		}
		System.out.println(Arrays.toString(arr));
		int start = highestindex - highest / 2;
		int end = highestindex + highest / 2;
		palindromstring = new String(str);

		System.out.println("complete string is " + palindromstring);

		System.out.println("longest palandrome    " + palindromstring.substring(start, end + 1).toString());

	}

	public static void main(String[] args) {
		String str = "bcabanxabbaxabbk";

		char[] ch = str.toCharArray();
		LongestPalindromicSubstring.longest(ch, str.length());

	}
}

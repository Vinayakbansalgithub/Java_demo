package Recurssion;

import java.util.Arrays;

public class GetPermutation {

	static String[] getper(String str) {
		// TODO Auto-generated method stub

		if (str.length() == 0) {
			String arr[] = { "" };
			return arr;
		}
		char c = str.charAt(0);
		String restOfString = str.substring(1);
		String[] rr = getper(restOfString);

		int k = 0;
		String result[];

		// create array, not the base case
		if (rr.length == 1 && rr[0] == "") {
			result = new String[1];
		} else {
			result = new String[(rr[0].length() + 1) * rr.length];
		}
		
		for (int i = 0; i < rr.length; i++) {
			System.out.println("for value:" + rr[i] + " inserting:" + str.charAt(0));
			for (int j = 0; j <= rr[i].length(); j++) {
				result[k] = rr[i].substring(0, j) + c + rr[i].substring(j);
				k++;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		String str = "123";
		String arr[] = getper(str);
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}
}

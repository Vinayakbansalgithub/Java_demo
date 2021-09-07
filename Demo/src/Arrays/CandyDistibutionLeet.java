package Arrays;

import java.util.Arrays;

// CandyDistibutionLeet
//https://leetcode.com/problems/candy/

public class CandyDistibutionLeet {

	public static void main(String[] args) {
		

		
		int arr[] = { 7, 1, 5, 3, 6, 4 };

		System.out.println("max candies is " + findCandies(arr));
	}

	private static int findCandies(int[] arr) {

		int left[] = new int[arr.length];
		Arrays.fill(left, 1);
		int right[] = new int[arr.length];
		Arrays.fill(right, 1);

		for (int i = 1; i < left.length; i++) {
			if (arr[i - 1] < arr[i])
				left[i] = left[i - 1] + 1;
		}

		for (int i = right.length - 2; i >= 0; i--) {
			if (arr[i + 1] < arr[i])
				right[i] = right[i + 1] + 1;
		}

		int totalCandies = 0;

		for (int i = 0; i < arr.length; i++) {
			totalCandies += Math.max(left[i], right[i]);
		}

		return totalCandies;
	}

}

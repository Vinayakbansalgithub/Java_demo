package Arrays;

import java.util.Arrays;

public class CatalnNumber {
	public static void main(String[] args) {

		// for n 4 use 5 because we have 0
		int n = 6;

		int arr[] = new int[n];

		arr[0] = arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {

			for (int j = 0; j < i; j++) {

				arr[i] += arr[j] * arr[i - j - 1];

			}

		}

		System.out.println(Arrays.toString(arr));

	}
}

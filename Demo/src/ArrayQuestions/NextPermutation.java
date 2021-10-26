package ArrayQuestions;

import java.util.Arrays;

// leetcode 31
public class NextPermutation {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 4, 7, 6, 5, 3, 1 };
		find(arr);
	}

	static void find(int[] arr) {
		// TODO Auto-generated method stub

		int lastPeekIndex = -1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				lastPeekIndex = i;
			}
		}

		if (lastPeekIndex == -1) {

			// need to reverse entire array next of 3 2 1 is 1 2 3
			int i = 0;
			int j = arr.length - 1;
			while (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
				j--;
			}

			System.out.println(Arrays.toString(arr));
			return;

		}

		int replaceIndex=01;
		int greaterThen = arr[lastPeekIndex-1];
		int smallerThen = arr[lastPeekIndex];
		for (int i = lastPeekIndex; i < arr.length; i++) {
			if (arr[i] > greaterThen&& arr[i] < smallerThen) {
				replaceIndex = i;
			}
		}

		int temp = arr[lastPeekIndex - 1];
		arr[lastPeekIndex - 1] = arr[replaceIndex];
		arr[replaceIndex] = temp;

		Arrays.sort(arr, lastPeekIndex, arr.length);

	}
}

package ArrayQuestions;

import java.util.Arrays;

public class NextPermutation {
	public static void main(String[] args) {
		int arr[] = { 3, 2, 1 };
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

		int mn = arr[lastPeekIndex];
		int index = lastPeekIndex;
		for (int i = lastPeekIndex; i < arr.length; i++) {
			if (arr[i] > arr[lastPeekIndex - 1] && arr[i] < arr[index]) {
				index = i;
			}
		}

		int temp = arr[lastPeekIndex - 1];
		arr[lastPeekIndex - 1] = arr[index];
		arr[index] = temp;

		Arrays.sort(arr, lastPeekIndex, arr.length);

	}
}

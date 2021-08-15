package ArrayQuestions;

import java.util.Arrays;

//  main program

// leet 179. Largest Number

public class LargestNumeberFormedFromArray {

	static int max = 0;

	public static void main(String[] args) {
		int arr[] = { 9, 34, 33, 2, 8 };
		int n = arr.length;
		LargestNumeberFormedFromArray permutation = new LargestNumeberFormedFromArray();
		permutation.permute(arr, 0, n - 1);
		System.out.println("number is " + Arrays.toString(arr));
	}

	private void permute(int arr[], int start, int end) {

		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				String one = arr[i] + "" + arr[j];
				String two = arr[j] + "" + arr[i];
				if (Integer.parseInt(one) < Integer.parseInt(two)) {
					swap(arr, i, j);
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public void swap(int arr[], int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

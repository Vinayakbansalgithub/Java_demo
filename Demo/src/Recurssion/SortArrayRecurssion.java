package Recurssion;

import java.util.Arrays;

public class SortArrayRecurssion {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8 };
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub

		if (start == end) {

			return;
		}

		sort(arr, start, end - 1);

		System.out.println("start is " + start);
		System.out.println("end is " + end);

		int[] subarray1 = Arrays.copyOfRange(arr, start, end);

		int[] subarray2 = Arrays.copyOfRange(arr, end, end + 1);

		int mergedArr[] = new int[subarray1.length + subarray2.length];
		int i = 0, j = 0, k = 0;

		while (i < subarray1.length && j < subarray2.length) {

			if (subarray1[i] > subarray2[j]) {
				mergedArr[k] = subarray2[j];
				j++;

			} else {
				mergedArr[k] = subarray1[i];
				i++;
			}
			k++;

		}

		while (i < subarray1.length) {
			mergedArr[k] = subarray1[i];
			i++;
			k++;
		}
		while (j < subarray2.length) {
			mergedArr[k] = subarray2[j];
			j++;
			k++;
		}
		for (int z = 0; z < mergedArr.length; z++) {
			System.out.println(mergedArr[z]);
			arr[z] = mergedArr[z];
		}

		System.out.println("=================");

	}
}

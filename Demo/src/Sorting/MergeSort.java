package Sorting;

import java.util.Arrays;

public class MergeSort {
	private static int[] sort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		// System.out.println(Arrays.toString(arr));

		System.out.println("start: " + start + "  end:" + end);

		int mid = (end + start) / 2;

		if (start == end) {
			int[] arrtemp = new int[1];
			arrtemp[0] = arr[start];
			return arrtemp;
		}

		int[] temp1 = sort(arr, start, mid);
		// System.out.println(Arrays.toString(temp1));

		int[] temp2 = sort(arr, mid + 1, end);
		// System.out.println(Arrays.toString(temp2));

		return merge(temp1, temp2);

	}

	static int[] merge(int[] arr1, int[] arr2) {
		int[] finalArr = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				finalArr[k] = arr1[i];
				k++;
				i++;

			} else {
				finalArr[k] = arr2[j];
				k++;
				j++;
			}

		}
		while (i < arr1.length) {
			finalArr[k] = arr1[i];
			k++;
			i++;
		}
		while (j < arr2.length) {
			finalArr[k] = arr2[j];
			k++;
			j++;
		}

		return finalArr;
	}

	public static void main(String[] args) {

		int arr[] = { 50, 40, 30, 20, 10 };
		int[] arrresult = sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arrresult));

	}
}

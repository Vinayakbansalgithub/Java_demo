package Arrays;

import java.util.Arrays;

public class FirstLastOccurenceOfData {

	static int findFirst(int[] arr, int index, int data) {
		int arrIndex = -1;

		if (index == arr.length) {
			return -1;
		}

		if (arr[index] == data) {
			return index;
		} else {
			arrIndex = findFirst(arr, index + 1, data);
			return arrIndex;
		}

	}

	static int findLast(int[] arr, int index, int data) {

		int arrIndex = -1;
		if (index == arr.length) {
			return -1;
		}

		arrIndex = findLast(arr, index + 1, data);

		if (arrIndex == -1) {

			if (arr[index] == data) {

				return index;
			} else {
				return -1;
			}

		}
		return arrIndex;

	}

	static int[] allIndex(int[] arr, int index, int data, int count) {
		int[] arrind;
		if (index == arr.length) {
			int[] baseArr = new int[count];
			return baseArr;
		}

		if (arr[index] == data) {
			arrind = allIndex(arr, index + 1, data, count + 1);
		} else {
			arrind = allIndex(arr, index + 1, data, count);

		}

		if (arr[index] == data) {
			arrind[count] = index;
		}

		return arrind;

	}

	public static void main(String[] args) throws Exception {

		//int arrUnsorted[] = { 1, 2, 13, 14, 14, 15 };
		int arr[] = { 3, 8, 1, 8, 8, 15 };

		System.out.println(findFirst(arr, 0, 15));
		System.out.println(findLast(arr, 0, 8));
		System.out.println(Arrays.toString(allIndex(arr, 0, 8, 0)));
	}
}

package Trees;

import java.util.Arrays;


//min heap top element is highest
public class MinHeap {
	public static void main(String[] args) {
		//int arr[] = { 11, 3, 0, 2, 1, 11, 5, 9, 0, 6, 5, 9, 8 };
		 int[] arr = { 1, 3, 6, 14, 10, 2 };


		Max_heapfy(arr);

	}

	static int length;
	static int sortedlength;

	static int[] sortedarray;
	static int count=0;

	public static void Max_heapfy(int[] arr) {
		sortedarray = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {

				heapfy(arr, j);

			}

			sortedarray[count] = arr[0];
			count++;
			arr[0] = arr[arr.length - 1];
			arr = Arrays.copyOf(arr, arr.length - 1);

		}

		System.out.println(Arrays.toString(sortedarray));

	}

	static void heapfy(int[] arr, int index) {

		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int min = arr[index];
		int minIndex = index;

		if (left < arr.length && arr[left] < min) {
			min = arr[left];
			minIndex = left;
		}

		if (right < arr.length && arr[right] < min) {
			min = arr[right];
			minIndex = right;

		}

		if (arr[index] != min) {

			int temp = arr[index];
			arr[index] = arr[minIndex];
			arr[minIndex] = temp;

			// to make all left and right element larger then parent
			heapfy(arr, minIndex);

		}

	}
}

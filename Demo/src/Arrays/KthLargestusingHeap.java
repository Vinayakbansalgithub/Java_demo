package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestusingHeap {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		Max_heap(arr, 4);
	}

	static void Max_heap(int[] arr, int klarget) {

		int initialLength = arr.length;

		for (int i = 1; i <= initialLength; i++) {

			for (int j = arr.length - 1; j >= 0; j--) {
				makeheapMax(arr, j);

			}
			System.out.println(Arrays.toString(arr));

			if (i == klarget) {
				System.out.println("element is " + arr[0]);
			}
			arr[0] = arr[arr.length - 1];
			arr = Arrays.copyOf(arr, arr.length - 1);

		}

	}

	// max heap means biggest number on the top

	static void makeheapMax(int[] arr, int j) {

		int largest;
		int left = j * 2 + 1;
		int right = j * 2 + 2;

		if (left < arr.length && arr[left] > arr[j]) {
			largest = left;
		} else {
			largest = j;
		}

		if (right < arr.length && arr[right] > arr[largest]) {
			largest = right;

		}

		if (j != largest) {
			int temp = arr[j];

			arr[j] = arr[largest];
			arr[largest] = temp;

		}

	}

	static void makeheapMin(int[] arr, int j) {
		// TODO Auto-generated method stub

		int smallest;
		int left = j * 2 + 1;
		int right = j * 2 + 2;

		if (left < arr.length && arr[left] < arr[j]) {
			smallest = left;

		} else {
			smallest = j;
		}

		if (right < arr.length && arr[right] < arr[smallest]) {
			smallest = right;

		}

		if (j != smallest) {
			int temp = arr[j];

			arr[j] = arr[smallest];
			arr[smallest] = temp;

		}

	}
}

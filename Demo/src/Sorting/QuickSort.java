package Sorting;

public class QuickSort {
	int[] sort(int[] arr, int start, int end) {

		int pivot = (start + end) / 2;

		int left = start;
		int right = end;

		if (right < left)
			return arr;

		while (left <= right) {

			while (arr[left] < arr[pivot])
				left++;

			while (arr[right] > arr[pivot])
				right--;

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}

		sort(arr, start, right);
		sort(arr, left, end);

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5, 9, 3 };
		int len = arr.length;

		QuickSort obj = new QuickSort();
		int[] arrres = obj.sort(arr, 0, len - 1);
		for (int i = 0; i < arrres.length; i++) {
			System.out.println(arrres[i]);
		}
	}
}

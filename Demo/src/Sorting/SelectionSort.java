package Sorting;

// complexity n^2
public class SelectionSort {

	private int[] sort(int[] arr, int start, int end) {

		if (start == end)
			return arr;

		int min = start;

		for (int i = start + 1; i <= end; i++) {

			if (arr[i] < arr[min])
				min = i;
		}

		if (start != min) {
			int temp = arr[min];
			arr[min] = arr[start];
			arr[start] = temp;

		}
		sort(arr, start + 1, end);

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 3, 6, 4 };
		SelectionSort obj = new SelectionSort();
		int[] arrRes = obj.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arrRes[i]);
		}

	}

}

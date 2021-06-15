package Sorting;

public class InsertionSort {
	int size;
	int[] arr;

	public int[] sort(int[] arr, int start, int end) {

		if (start == end)
			return arr;

		// value to consider
		int value = arr[start];

		int j = start;
		
		System.out.println("j is "+j);

		while (j > 0) {
			if (arr[j - 1] > value) {
				int temp = arr[j - 1];
				arr[j - 1] = value;
				arr[j] = temp;
			}
			j--;
		}

		sort(arr, start + 1, end);

		return arr;

	}

	public static void main(String[] args) {

		int arr[] = { 50,40,30,20,10};
		InsertionSort obj = new InsertionSort();
		obj.sort(arr, 0, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

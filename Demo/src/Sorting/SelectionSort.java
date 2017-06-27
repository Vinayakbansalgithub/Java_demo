package Sorting;

public class SelectionSort {
	int size;
	int[] arr;

	public int[] sort(int arr[]) {
		size = arr.length;
		this.arr = arr;
		int temp;

		for (int i = 0; i < arr.length; i++) {
			int smallIndex = i;

			for (int i1 = i; i1 < arr.length; i1++) {
				if (arr[smallIndex] > arr[i1]) {

					smallIndex = i1;
				}
			}
			

			temp = arr[i];
			arr[i] = arr[smallIndex];
			arr[smallIndex] = temp;

		}

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14, };
		SelectionSort obj = new SelectionSort();
		obj.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

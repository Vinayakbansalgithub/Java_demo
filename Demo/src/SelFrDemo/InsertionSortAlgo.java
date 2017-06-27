package SelFrDemo;

public class InsertionSortAlgo {

	// average complexity of insertion sort is n2

	static void sort(int arr[]) {

		int temp, key, j;
		for (int z = 1; z < arr.length; z++) {
			key = arr[z];
			j = z - 1;

			System.out.println("key for the perticular item is    " + key);
			while (j >= 0 && arr[j] > key) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
				j--;

			}

			for (int k = 0; k < arr.length; k++)
				System.out.println("value after first itertion  " + arr[k]);
			System.out.println("--------------");

		}
		for (int k = 0; k < arr.length; k++)
			System.out.println("value after sorting  " + arr[k]);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 6, 1, 3 };
		sort(arr);
	}
}

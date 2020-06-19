<<<<<<< HEAD
package Sorting;

public class InsertionSortAgain {
	int temp;
	int key;

	//complexity  n2
	private void sort(int[] arr, int length) {

		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					j--;

				} else
					j--;

			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 5, 111, 1, -5, 16, 9, 2, 12, -14, 3 };
		int len = arr.length;

		InsertionSortAgain obj = new InsertionSortAgain();
		obj.sort(arr, len - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
=======
package Sorting;

public class InsertionSortAgain {
	int temp;
	int key;

	//complexity  n2
	private void sort(int[] arr, int length) {

		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					j--;

				} else
					j--;

			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 5, 111, 1, -5, 16, 9, 2, 12, -14, 3 };
		int len = arr.length;

		InsertionSortAgain obj = new InsertionSortAgain();
		obj.sort(arr, len - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
>>>>>>> branch 'master' of https://github.com/Vinayakbansalgithub/Java_demo.git

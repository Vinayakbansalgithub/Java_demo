package BinarySearch;

public class PaintersPartitionProblem {

	private static int isValid(int[] arr, int k, int mid) {

		int painters = 1;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum > mid) {
				painters++;
				sum = arr[i];

			}
		}

		return painters;
	}

	private static void getMinPages(int[] arr, int k) {

		// get Max value

		int minRange = 0;
		int MaxRange = 0;

		int possibleAnswer = -1;

		for (int i = 0; i <= arr.length - 1; i++)
			if (arr[i] > minRange)
				minRange = arr[i];

		for (int i = 0; i <= arr.length - 1; i++)
			MaxRange += arr[i];

		while (minRange < MaxRange) {
			System.out.println("min is " + minRange + "  max is " + MaxRange);

			int mid = (MaxRange + minRange) / 2;

			System.out.println("mid is " + mid);

			if (isValid(arr, k, mid) <= k) {
				possibleAnswer = mid;
				MaxRange = mid;
			} else {
				minRange = mid + 1;

			}

		}

		System.out.println("min number of pages are " + possibleAnswer);

	}

	public static void main(String[] args) {
		// pages in book
		int arr[] = { 10, 20, 30, 40 };
		// number of students
		int k = 2;
		getMinPages(arr, k);
	}

}

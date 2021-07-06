package BinarySearch;

public class AllocateMinNumOFPages {

	private static void getMinPages(int[] arr, int k) {
		// TODO Auto-generated method stub

		// get Max value

		int minRange = 0;
		int MaxRange = 0;

		int possibleAnswer = -1;

		for (int i = 0; i <= arr.length - 1; i++)
			if (arr[i] > minRange)
				minRange = arr[i];

		for (int i = 0; i <= arr.length - 1; i++)
			MaxRange += arr[i];

		System.out.println("min is " + minRange + "  max is " + MaxRange);

		while (minRange < MaxRange) {

			int mid = minRange + (MaxRange - minRange) / 2;

			if (isValid(arr, k, mid)) {
				possibleAnswer = mid;
				MaxRange = mid - 1;
			} else {
				minRange = mid + 1;
			}

		}

		System.out.println("min number of pages are " + possibleAnswer);

	}

	private static boolean isValid(int[] arr, int k, int mid) {
		// TODO Auto-generated method stub

		int number = 1;
		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];

			if (sum > mid) {
				number++;
				sum = arr[i];

			}
		}

		if (number == k)
			return true;

		return false;
	}

	public static void main(String[] args) {
		// pages in book
		int arr[] = { 10, 20, 30, 40 };
		// number of students
		int k = 2;
		getMinPages(arr, k);
	}

}

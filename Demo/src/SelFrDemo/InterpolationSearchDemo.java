package SelFrDemo;

public class InterpolationSearchDemo {

	int search(int arr[], int value) {
		int low = 0;
		int high = arr.length - 1;
		int item = value;
		int mid = 0;
		while (arr[mid] != item) {

			if (low > high) {
				System.out.println("value cannot be find");
				break;
			}
			mid = low
					+ (((item - arr[low]) * (high - low)) / (arr[high] - arr[low]));
			if (arr[mid] == item) {

				System.out.println("item found at index " + mid);
			}

			if (arr[mid] > item) {
				high = mid - 1;

			}
			if (arr[mid] < item) {

				low = mid + 1;
			}

		}
		return mid;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 7, 8, 11, 23, 33 };

		InterpolationSearchDemo obj = new InterpolationSearchDemo();
		int index = obj.search(arr, 11);
		System.out.println("value found at index    " + index);
	}
}

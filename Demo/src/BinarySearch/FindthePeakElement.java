package BinarySearch;


//162. Find Peak Element

public class FindthePeakElement {

	static int peek(int arr[], int start, int end) {

		while (start != end) {
			int mid = start + (end - start) / 2;

			// base
			if (start == end)
				return end;

			// checking mid === 0 means thet left condition is satisfied
			if ((mid == 0 || arr[mid] > arr[mid - 1]) && 
					(arr[mid] > arr[mid + 1] || arr.length - 1 == mid + 1)) {
				return arr[mid];
			} else if (0 < mid && arr[mid] < arr[mid - 1]) {
				end = mid - 1;
				peek(arr, start, end);
			} else {
				start = mid + 1;
				peek(arr, start, end);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 1,2,1,3,5,6,4};

		int peek = peek(arr, 0, arr.length - 1);
		System.out.println("peek is  " + peek);

	}
}

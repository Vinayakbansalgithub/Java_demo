package BinarySearch;

public class FirstAndLastOccurenceInSorted {

	static int bs(int arr[], int start, int end, int element) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				end = mid - 1;
				index = bs(arr, start, end, element);

			} else {
				start = mid + 1;
				index = bs(arr, start, end, element);
			}

			return index;
		}
		return -1;

	}

	static int firstOccurence(int arr[], int start, int end, int element) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] == element) {
				index = mid;
				end = mid - 1;
				index = bs(arr, start, end, element);
			} else if (arr[mid] > element) {
				end = mid - 1;
				index = bs(arr, start, end, element);
			} else {
				start = mid + 1;
				index = bs(arr, start, end, element);
			}

			return index;
		}
		return -1;

	}

	static int LastOccurence(int arr[], int start, int end, int element) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = -1;

			if (arr[mid] == element) {
				index = mid;
				start = mid + 1;
				index = bs(arr, start, end, element);

			} else if (arr[mid] > element) {
				end = mid - 1;
				index = bs(arr, start, end, element);

			} else {
				start = mid + 1;
				index = bs(arr, start, end, element);
			}

			return index;
		}
		return -1;

	}

	static int NumberOfTimesRotatedeSortedArray(int arr[], int start, int end) {

		if (start <= end) {
			int mid = start + (end - start) / 2;
			int index = 0;

			// 10 9 9
			if (arr[mid] < arr[mid - 1] && arr[mid] <= arr[mid + 1]) {
				return mid;
			} else if (arr[start] < arr[mid]) { // 10 11 12
				start = mid + 1;
				if (start == arr.length)
					start = 0;
				index = NumberOfTimesRotatedeSortedArray(arr, start, end);
			} else if (arr[mid] < arr[end]) { // 9 10 11
				end = mid - 1;
				if (end == -1)
					end = arr.length - 1;
				index = NumberOfTimesRotatedeSortedArray(arr, start, end);
			}

			return index;
		}
		return -1;

	}
	
	static int findMin(int arr[], int low, int high) {
		// This condition is needed to handle the case when array
		// is not rotated at all

		// or first elemnt is smallest case where high is -1
		// imp remember this case

		if (high < low) {
			return arr[0];
		}

		// If there is only one element left
		if (high == low)
			return arr[low];

		// Find mid
		int mid = (low + high) / 2;

		// Check if element (mid+1) is minimum element. Consider
		// the cases like {3, 4, 5, 1, 2}
		if (arr[mid + 1] < arr[mid])
			return arr[mid + 1];
		
		
//		if (mid < high && arr[mid + 1] < arr[mid])
//			return arr[mid + 1];

		// Check if mid itself is minimum element
		if (mid > low && arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1])
			return arr[mid];

		// Decide whether we need to go to left half or right half
		if (arr[high] > arr[mid])
			return findMin(arr, low, mid - 1);
		else
			return findMin(arr, mid + 1, high);
	}

	public static void main(String[] args) {
		int[] arr = { 20,28, 4, 10, 10, 10, 18 };

		int res = bs(arr, 0, arr.length - 1, 10);
		System.out.println(res);

		int firstRes = firstOccurence(arr, 0, arr.length - 1, 10);
		System.out.println("firstRes " + firstRes);

		int lastRes = LastOccurence(arr, 0, arr.length - 1, 18);
		System.out.println("lastRes " + lastRes);

		System.out.println("count " + (lastRes - firstRes));

		// index of smallest element return the number of rotations
		//int[] arrNew = { 10, 10, 18, 2, 2, 4, 10 };
		//int[] arrNew = { 10, 11,12 };

		
		int min=findMin(arr, 0, arr.length - 1);
		
		System.out.println("min element is "+min);
		
		 firstRes = firstOccurence(arr, 0, arr.length - 1, min);

	

		// we know the index of smallest element, by that array left to it is sorted and
		// array right to it is sorted, apply bs
		int res1 = bs(arr, 0, firstRes - 1, min);
		int res2 = bs(arr, firstRes, arr.length - 1, min);

		System.out.println("element index  " + Math.max(res1, res2));

	}
}

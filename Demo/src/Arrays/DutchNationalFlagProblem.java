package Arrays;

// https://www.youtube.com/watch?v=uvB-Ns_TVis&ab_channel=NickWhite
public class DutchNationalFlagProblem {

	// Sort the input array, the array is assumed to
	// have values in {0, 1, 2}

	// time complexity is O(n)
	// also it is inplace algo
	static void sort012(int arr[], int start, int end) {

		int index = 0;

		while (start < end && index <= end) {

			if (arr[index] == 0) {
				arr[index] = arr[start];
				arr[start] = 0;

				start++;
				index++;

			} else if (arr[index] == 2) {
				arr[index] = arr[end];

				arr[end] = 2;
				end--;

			} else
				index++;

			for (int i = 0; i < arr.length; i++) {
				System.out.print(" " + arr[i]);
			}
			System.out.println();
		}

	}

	/* Driver function to check for above functions */
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 1 };
		sort012(arr, 0, arr.length - 1);
	}
}

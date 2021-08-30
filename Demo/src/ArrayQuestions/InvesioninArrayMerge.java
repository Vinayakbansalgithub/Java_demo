package ArrayQuestions;

public class InvesioninArrayMerge {
	static int swaps = 0;

	private static int[] mergeAndCount(int[] arr1, int[] arr2) {

		int[] finalArr = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				finalArr[k] = arr1[i];
				k++;
				i++;
			} else {
				finalArr[k] = arr2[j];
				k++;
				j++;
				swaps += arr1.length - i;

			}
		}

		// Fill from the rest of the left subarray
		while (i < arr1.length)
			finalArr[k++] = arr1[i++];

		// Fill from the rest of the right subarray
		while (j < arr2.length)
			finalArr[k++] = arr2[j++];

		return finalArr;
	}

	// Merge sort function
	private static int[] mergeSortAndCount(int[] arr, int l, int r) {

		// Keeps track of the inversion count at a
		// particular node of the recursion tree
		// int count = 0;

		int m = (l + r) / 2;
		if (l == r) {
			int temparr[] = new int[1];
			temparr[0] = arr[l];
			return temparr;
		}

		// Total inversion count = left subarray count
		// + right subarray count + merge count

		// Left subarray count
		int[] temp1 = mergeSortAndCount(arr, l, m);

		// Right subarray count
		int[] temp2 = mergeSortAndCount(arr, m + 1, r);

		// Merge count
		return mergeAndCount(temp1, temp2);

	}

	// Driver code
	public static void main(String[] args) {
		// int[] arr = { 1, 20, 6, 7, 5, 8, 11, 3 };
		int[] arr = { 1, 20, 6, 7 };

		mergeSortAndCount(arr, 0, arr.length - 1);
		System.out.println(swaps);
	}
}

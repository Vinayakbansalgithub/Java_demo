package SelFrDemo;

public class MergeSortAlgo {
	int arr[];
	/* create temp arrays */
	int L[], R[];

	void sort(int arrpass[]) {
		arr = arrpass;
		int lowerIndex = 0;

		int higherIndex = arr.length - 1;

		divide(lowerIndex, higherIndex);

	}

	public void divide(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		if (lowerIndex < higherIndex) {
			int mid = (lowerIndex + higherIndex) / 2;
			divide(lowerIndex, mid);
			divide(mid + 1, higherIndex);

			merge(lowerIndex, mid, higherIndex);

		} else
			System.out.println("cannot be further divided lower index is "
					+ lowerIndex + "   higher index is  " + higherIndex);
		System.out.println("--------------------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("value "+arr[i]);
		}
	}

	public void merge(int lowerIndex, int mid, int higherIndex) {
		// TODO Auto-generated method stub
		// This i two finger problem

		int n1 = mid - lowerIndex + 1;
		int n2 = higherIndex - mid;

		L = new int[n1];// initilize array
		R = new int[n2];
		for (int x = 0; x < n1; ++x)
			L[x] = arr[lowerIndex + x];
		for (int y = 0; y < n2; ++y)
			R[y] = arr[mid + 1 + y];

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;
		int k = lowerIndex;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		MergeSortAlgo obj = new MergeSortAlgo();

		int arr[] = { 11, 27, 2, 12, 1, 4, 13, 99, 5, 31, 65, 8 };
		obj.sort(arr);
	}
}

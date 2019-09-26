package Sorting;

public class MergesortAgain {

	int arr[];
	int length, higherIndex, lowerIndex, middleIndex;
	int L[], R[];

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		this.arr = arr;
		length = arr.length;
		higherIndex = length - 1;
		divide(lowerIndex, higherIndex);

	}

	private void divide(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		if (lowerIndex < higherIndex) {
			int middleIndex = (higherIndex + lowerIndex) / 2;
			divide(lowerIndex, middleIndex);
			divide(middleIndex + 1, higherIndex);
			merge(lowerIndex, middleIndex, higherIndex);

		}

	}

	private void merge(int lowerIndex, int middleIndex, int higherIndex) {

		int n1 = middleIndex - lowerIndex + 1;
		int n2 = higherIndex - middleIndex;

		L = new int[n1];
		R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[lowerIndex + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = arr[middleIndex + 1 + j];

		}
		
		int ii = 0,jj=0;
		int k=lowerIndex;
		
		while(ii<n1&& jj<n2) {
			
			
			if(L[ii]<R[jj]) {
				
				arr[k]=L[ii];
				ii++;
			}else
			{
				arr[k]=R[jj];
				jj++;
				
			}
			
			k++;
			
			
		}
		
		/* Copy remaining elements of L[] if any */
		while (ii < n1) {
			arr[k] = L[ii];
			ii++;
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (jj < n2) {
			arr[k] = R[jj];
			jj++;
			k++;
		}
		

	}

	public static void main(String[] args) {

		int arr[] = { 38, 27, 43, 3, 9, 82, 10 };

		MergesortAgain obj = new MergesortAgain();
		obj.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

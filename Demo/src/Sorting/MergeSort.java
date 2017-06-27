package Sorting;

public class MergeSort {
	int arr[];
	int length;
	int lowerIndex=0;
	int higherIndex;
	int middleIndex;
	int L[], R[];

	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		this.arr=arr;
		length=arr.length;
		higherIndex=length-1;
		divide(lowerIndex,higherIndex);
		
		
	}
	
	public void divide(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		if(lowerIndex<higherIndex){
			int middleIndex = (lowerIndex + higherIndex) / 2;
		divide(lowerIndex, middleIndex);
		divide(middleIndex+1, higherIndex);
		merge(lowerIndex,middleIndex,higherIndex);
		}
	}

	public void merge(int lowerIndex, int middleIndex, int higherIndex) {
		// TODO Auto-generated method stub

		int n1 = middleIndex - lowerIndex + 1;
		int n2 = higherIndex - middleIndex;

		L = new int[n1];// initilize array
		R = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i]=arr[i+lowerIndex];
		}
		for (int j = 0; j < n2; j++) {
			R[j]=arr[j+middleIndex+1];
		}
		// Initial indexes of first and second subarrays
				int i = 0, j = 0;
				int k = lowerIndex;
		while (i<n1 && j<n2) {
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
		int arr[]={38,27,43,3,9,82,10};
		
		MergeSort obj= new MergeSort();
		obj.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


}

package SelFrDemo;

public class BubbleSortAlgo {
	
	
	// complexity of bubble sort is n2
	
	static void sort(int arr[]) {
		int[] arrsort = arr;
		int temp;
		for (int Z =  arr.length-1; Z >= 1; Z--) {
		for (int i = 0; i < Z; i++) {

			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		}
		
	}
		for (int k = 0; k < arr.length; k++)
			System.out.println("value after sorting  " + arr[k]);
	}
	public static void main(String[] args) {
		int arr[] = { 11, 27, 9, 12, 4 };
		sort(arr);
	}
}

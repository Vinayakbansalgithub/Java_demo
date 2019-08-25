package Sorting;

import java.util.Arrays;

public class BubbleSortAgain {
	
	int temp;
	private void sort(int[] arr, int length) {
		
	for (int i = 1; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			
			if(arr[j]>arr[j+1]) {
				temp=arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
			}
			
		}
		
		System.out.println("after first iteration"+Arrays.toString(arr));
	}
		
	
	}
	public static void main(String[] args) {
		int arr[] = {100, 791, 80, 9, 219, 14,7};
		int len=arr.length;
				
		BubbleSortAgain obj = new BubbleSortAgain();
		obj.sort(arr,len-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
}

}

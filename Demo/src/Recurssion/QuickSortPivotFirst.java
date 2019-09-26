package Recurssion;

import java.util.Arrays;

//Important to view
// https://www.youtube.com/watch?v=tWCaFVJMUi8
public class QuickSortPivotFirst {

	static void sort(int[] arr, int pivotIndex,int start, int end) {
		// TODO Auto-generated method stub
		
	
		
		int pivot = arr[start];
		
		int right = end;
		int left=start+1;
		
		//base case
		if(left>arr.length-1) {
			return;
		}
		if(right<=0) {
			return;
		}
		
			
			
		while (left <= right) {
		
		while(pivot>arr[left]) {
			left++;
		}
		while(pivot<arr[right]) {
			right--;
		}

		if(left<right) {
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
		}else {
			// if start>=end
			int temp=arr[right];
			arr[right]=pivot;
			arr[pivotIndex]=temp;
		}
		
		//System.out.println(Arrays.toString(arr));
		}
		//System.out.println();
		
		
		sort(arr,start,start,right-1);
		sort(arr,left,left,end);

	}

	public static void main(String[] args) {
		int arr[] = { 35, 150, 1115, 11125, 111180, 1111120, 11111190, 111111145,1 };
		sort(arr, 0,0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}

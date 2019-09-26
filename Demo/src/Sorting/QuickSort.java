package Sorting;

public class QuickSort {
	 void sort(int[] arr, int low, int high) {
			// TODO Auto-generated method stub
			 if(low<high){
			 int pi= partition(arr,low,high);
			 sort(arr,  0,  pi-1);
			 sort(arr,  pi+1,  high);

			 }
			 
		}
	 int partition(int[] arr, int low, int high) {
			// TODO Auto-generated method stub
		 int i=low-1;
		 int temp;
		 int pivot= arr[high];
		 for (int j = low; j < arr.length-1; j++) {
			if(arr[j]<pivot){
				i++;
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			
		}
			temp=arr[i+1];
			arr[i+1]=pivot;
			arr[high]=temp;
		
			return i+1;
		}
	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5,9,3 };
		int len=arr.length;
				
		QuickSort obj = new QuickSort();
		obj.sort(arr,0,len-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

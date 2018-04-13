package Sorting;

public class QuickSortAgain {
	static int kth=2;

	static void sort(int[] arr, int low, int high) {
			
		
		if(low<high){
		
		int pi=partition(arr,low,high);
		
		sort(arr,0,pi-1);
		sort(arr,pi+1,high);
		}

		
	}
	
	
	 static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int count=low-1;
		
		
		for (int i = low; i < arr.length; i++) {
			
			if(arr[i]>pivot){
				
				
				
			}
			else{
				count++;
				int temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				
				
				
			}
			
			
			
		}
		

		
		
		return count;
		
		

	}


	public static void main(String[] args) {
		int arr[] = {6, 5, 11, 3, 8, 4,27,9,12 };
		int len=arr.length;
				
		QuickSortAgain obj = new QuickSortAgain();
		obj.sort(arr,0,len-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

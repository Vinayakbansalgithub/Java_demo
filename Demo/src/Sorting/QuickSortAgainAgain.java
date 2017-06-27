package Sorting;

public class QuickSortAgainAgain {
	private void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low<high){
			int pi=partition(arr,low,high);
			sort(arr,0,pi-1);
			sort(arr,pi+1,high);
			
		}
		
	}
	
	
	
	
	 int partition(int[] arr, int low, int high) {
		 int head=low-1;
		 int pivot=arr[high];
		 int  temp;
for (int i = low; i < arr.length-1; i++) {
	 if(pivot>arr[i]){
		  head++;
		  temp=arr[i];		  
		  arr[i]=arr[head];
		  arr[head]=temp;
				  
		  
		  
	 }
}
		temp=arr[head+1];
		arr[head+1]=pivot;
		arr[high]=temp;
		 
		 
		 
		return head+1;
		
	}




	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5,9,3 };
		int len=arr.length;
				
		QuickSortAgainAgain obj = new QuickSortAgainAgain();
		obj.sort(arr,0,len-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


}

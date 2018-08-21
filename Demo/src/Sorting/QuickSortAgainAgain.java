package Sorting;

public class QuickSortAgainAgain {
	private void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
	if(low<high)
	{
		int middle=partition(arr, low, high);
		
		sort(arr,low,middle-1);
		sort(arr,middle+1,high);
		
	}
		
	}
	
	
	
	
	 int partition(int[] arr, int low, int high) {
		 
		 
		 int pivot=arr[high];
		 int head=low,temp;
		 
		 for (int i = low; i < high; i++) {
			
			 if(arr[i]<pivot){
				 temp=arr[i];
					arr[i]=arr[head];
					arr[head]=temp;
					head++;
			 }
			 
			 
			 
			 
			 
		}
		 
		 
		 temp=arr[head];
			arr[head]=pivot;
			arr[high]=temp;
		 return head;
		 
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

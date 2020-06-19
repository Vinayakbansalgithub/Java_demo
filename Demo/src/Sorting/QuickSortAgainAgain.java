<<<<<<< HEAD
package Sorting;

public class QuickSortAgainAgain {
	private void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		
		
		if(low<high) {
		int mid =partition(arr,  low, high);
		sort(arr,  low, mid-1);
		sort(arr,  mid+1, high);
		}

	}
	
	
	
	
	 int partition(int[] arr, int low, int high) {
		 
		 int pivot= arr[high];
		 int i=low-1;
		 
		for (int j = low; j < high; j++) {
			
	
		 
		 
		 
		 if(arr[j]>pivot) {
			 
			 
		 }else {
			 i++;
			 
			 int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 
			 
		 }
		 
		 
		 }
		 
		 int temp=arr[i+1];
			arr[i+1]=pivot;
			arr[high]=temp;
		 
		 
		return i+1;
		 
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
=======
package Sorting;

public class QuickSortAgainAgain {
	private void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		
		
		if(low<high) {
		int mid =partition(arr,  low, high);
		sort(arr,  low, mid-1);
		sort(arr,  mid+1, high);
		}

	}
	
	
	
	
	 int partition(int[] arr, int low, int high) {
		 
		 int pivot= arr[high];
		 int i=low-1;
		 
		for (int j = low; j < high; j++) {
			
	
		 
		 
		 
		 if(arr[j]>pivot) {
			 
			 
		 }else {
			 i++;
			 
			 int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 
			 
		 }
		 
		 
		 }
		 
		 int temp=arr[i+1];
			arr[i+1]=pivot;
			arr[high]=temp;
		 
		 
		return i+1;
		 
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
>>>>>>> branch 'master' of https://github.com/Vinayakbansalgithub/Java_demo.git

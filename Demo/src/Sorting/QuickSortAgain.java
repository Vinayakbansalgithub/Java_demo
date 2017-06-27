package Sorting;

public class QuickSortAgain {
	static int kth=2;

	private void sort(int[] arr, int low, int high) {
			if(low<=high){
				 int pi= partition(arr,low,high);
				 if(pi==kth)
				 System.out.println(kth+"   smallest element is"+arr[pi]);
				 
				 else if(pi>kth)
				 sort(arr,low,pi-1);
				 
				 else if(pi<kth)
				 sort(arr,pi+1,high);

				 
				 
			}	
			//System.out.println("first"+low);
	}
	
	
	 int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		 int pivot=arr[high];
		 int temp;
		 int count=low-1;
		 for (int i = low; i < arr.length; i++) {
			if(arr[i]<pivot){
				count++;
				temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				
				
			}
			 
			 
		}
		 
		 temp=arr[count+1];
			arr[count+1]=pivot;
			arr[high]=temp;
		 
		 
		return count+1;
	}


	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5,9,3 };
		int len=arr.length;
				
		QuickSortAgain obj = new QuickSortAgain();
		obj.sort(arr,0,len-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

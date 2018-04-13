package Sorting;

public class InsertionSortAgain {
	int arrSorted[];
	int temp;
	private void sort(int[] arr, int length) {
		arrSorted= new int[length];
		arrSorted[0]=arr[0];
		
		
		for (int j = 1; j < arr.length; j++) {
			
			while(j>0 && arr[j]<arr[j-1]){
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		}
	
	
	
	public static void main(String[] args) {
		

	int arr[] = {23, 42, 4, 16, 8, 15};
	int len=arr.length;
			
	InsertionSortAgain obj = new InsertionSortAgain();
	obj.sort(arr,len-1);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}

	
}

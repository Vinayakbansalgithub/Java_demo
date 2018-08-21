package Sorting;

public class InsertionSortAgain {
	int arrSorted[];
	int temp;
	private void sort(int[] arr, int length) {
		arrSorted= new int[length];
		arrSorted[0]=arr[0];
		
		
		
			
		for (int i = 1; i < arr.length; i++) {
			
			int j=i-1;
			
			while(j>=0){
				if(arr[j+1]<arr[j]){
					
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					j--;
					
				}
				else j--;
				
				
			}
			
			
		}	
			
			
		
		
		
		
		
		
		}
	
	
	
	public static void main(String[] args) {
		

		int arr[] = { 5, 11, 1, -5, 16,9, 2, 12, 14,3,-3,-3 };
		int len=arr.length;
			
	InsertionSortAgain obj = new InsertionSortAgain();
	obj.sort(arr,len-1);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}

	
}

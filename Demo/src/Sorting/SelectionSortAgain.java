package Sorting;

public class SelectionSortAgain {
	
	private void sort(int[] arr) {
		
			
			
			
		for (int i = 0; i < arr.length; i++) {
			int smallest=arr[i];
			int smallestIndex = i;
			
			for (int j = i; j < arr.length; j++) {
				
				if(arr[j]<smallest){
					smallest=arr[j];
				
					smallestIndex=j;
				}
			}
			
			
			int temp=arr[i];
			arr[i]=smallest;
			arr[smallestIndex]=temp;
			
			
			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 3, 6, 4 };
		SelectionSortAgain obj = new SelectionSortAgain();
		obj.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	
}

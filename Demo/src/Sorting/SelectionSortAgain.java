package Sorting;

public class SelectionSortAgain {
	
	private void sort(int[] arr) {
		int temp;
		int min;;
		int smallIndex = 0;
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < arr.length; i++) {
			min=arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<min){
					min=arr[j];
					smallIndex=j;
				}
			}
			temp = arr[i];
			arr[i] = arr[smallIndex];
			arr[smallIndex] = temp;

			
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = { 5, 1, 12, 15, 16, 2, 12, 14, };
		SelectionSortAgain obj = new SelectionSortAgain();
		obj.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	
}

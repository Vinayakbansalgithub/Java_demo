package Sorting;

public class BubbleSortAgain {
	
	
	private void sort(int[] arr, int length) {
		
		 int temp;
		 
		 for (int j = 0; j < arr.length; j++) {
			
		
		for (int i = 0; i < (arr.length-1)-j; i++) {
			
				if(arr[i]>arr[i+1]){

				temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;	
			}
		}
	}
	}
	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 21, 14,7};
		int len=arr.length;
				
		BubbleSortAgain obj = new BubbleSortAgain();
		obj.sort(arr,len-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
}

}

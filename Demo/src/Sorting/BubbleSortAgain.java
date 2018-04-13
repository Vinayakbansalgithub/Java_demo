package Sorting;

public class BubbleSortAgain {
	
	int temp;
	private void sort(int[] arr, int length) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				
				
				if(arr[j]<arr[j-1]){
					temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
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

package Sorting;

public class InsertionSort {
	int size;
	int[] arr;
	public int[] sort(int[] arr) {
		size = arr.length;
		this.arr = arr;
		int temp; 
		int element;
			for (int i = 1; i < arr.length; i++) {
				element=arr[i];
				int j=i;
				while ( j >0 && arr[j-1] > element) {
				
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
			
				}
		}
		return arr;
		
	}
	public static void main(String[] args) {
		

	int arr[] = { 5, 1, 12, -5, 16,9, 2, 12, 14,3 };
	BubbleSort obj = new BubbleSort();
	obj.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}

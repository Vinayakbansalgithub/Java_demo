package Sorting;



// complexity n^2
public class BubbleSort {
	int size;
	int[] arr;
	public int[] sort(int[] arr) {
		size = arr.length;
		this.arr = arr;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[j-1] > arr[j]){
				temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
			}}
		}
		return arr;
		
	}
public static void main(String[] args) {
	int arr[] = { 5, 1, 12, -5, 16, 2, 12, 14, };
	BubbleSort obj = new BubbleSort();
	obj.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}


}

package Sorting;

// complexity n^2
public class BubbleSort {
	int[] arr;

	public int[] sort(int[] arr, int start, int end) {
		this.arr = arr;
		
		if(start==end||end==0)
			return arr;

		if (arr[start] > arr[start + 1]) {
			int temp = arr[start];
			arr[start] = arr[start + 1];
			arr[start+1] = temp;
		}
		sort(arr, start + 1, end);
		sort(arr, start, end - 1);

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 50,40,30,20,10 };
		BubbleSort obj = new BubbleSort();
		obj.sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

package Arrays;

// https://www.youtube.com/watch?v=gmu0RA5_zxs&t=256s&ab_channel=NickWhite
// right rotate array
// leetcode 189
public class ImpRotateArrayKtimes {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

		int k = 3;

		// for left rotation
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("value " + arr[i]);
		}

		int arr2[] = { 10, 20, 30, 40, 50, 60, 70 };

		k = 3;

		// for right rotation
		reverse(arr2, 0, arr.length - 1);
		reverse(arr2, 0, k - 1);
		reverse(arr2, k, arr.length - 1);

		
		System.out.println("==================");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("value " + arr2[i]);
		}

	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

	}
}

package Arrays;

public class Equilibriumindexofanarray {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };

		int res=find(arr, arr.length);
		System.out.println(res);
	}

	private static int find(int[] arr, int n) {
		// TODO Auto-generated method stub

		int sum = 0;
		int leftSum = 0;
		for (int i : arr) {
			sum += i;
		}

		for (int i = 0; i < arr.length; i++) {

			sum = sum-arr[i];

			if (leftSum == sum) {
				return i;
			}
			leftSum = leftSum+arr[i];

		}
		return -1;

	}

}

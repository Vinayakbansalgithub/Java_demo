package ArrayQuestions;

public class MaxDistance {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2 };
		int res = find(arr, 0, arr.length - 1);
		System.out.println(res);
	}

	private static int find(int[] arr, int start, int end) {
		// TODO Auto-generated method stub

		if (start > end) {
			return -1;
		}

		int min = arr[start];
		int max = arr[end];

		if (min <= max) {
			return end - start;
		} else {

			int v1 = find(arr, start + 1, end);
			int v2 = find(arr, start, end - 1);

			return Math.max(v1, v2);

		}

	}
}

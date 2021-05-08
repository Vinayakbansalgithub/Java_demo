package ArrayQuestions;

public class SubarrayWithGivenSum {

	static void findSubarrays(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int add = 0;

		for (int i = 0; i < arr.length; i++) {
			int arrstart = i;
			int arrend = i;
			add = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (sum == add) {

					for (int k = arrstart; k <= arrend; k++) {
						System.out.print("  " + arr[k]);
					}
					System.out.println();
					System.out.println("*===============*");

				}

				add = add + arr[j];

				arrend++;

			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, -7, 3, 3, 1, -4 };
		int sum = 0;

		findSubarrays(arr, sum);
	}

}

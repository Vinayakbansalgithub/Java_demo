package ArrayQuestions;

//https://www.youtube.com/watch?v=Ofl4KgFhLsM&ab_channel=TECHDOSE
public class SubarrayWithGivenSum {

	static void findSubarrays(int[] arr, int sum) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int currentSum = arr[0];

		while (arrstart <= arrend) {

			while (currentSum > sum) {
				currentSum = currentSum - arr[arrstart];
				arrstart++;
			}

			if (currentSum == sum) {
				System.out.println("start is " + arrstart + "  end is " + (arrend-1));
				break;
			}

			if (currentSum < sum) {
				arrend++;
				currentSum += arr[arrend];

			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 9, 20, 3, 10, 5, 99 };
		int sum = 38;

		findSubarrays(arr, sum);
	}

}

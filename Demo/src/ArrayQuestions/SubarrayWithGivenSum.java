package ArrayQuestions;


//https://www.youtube.com/watch?v=Ofl4KgFhLsM&ab_channel=TECHDOSE
public class SubarrayWithGivenSum {

	static void findSubarrays(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int currentSum = 0;

		int arrstart = 0;
		int arrend = 0;

		for (int j = 0; j < arr.length; j++) {
			currentSum += arr[j];
			if (currentSum < sum) {

				arrend++;
			} else if (currentSum > sum) {
				currentSum = currentSum - arr[arrstart];
				arrstart++;
			}

		}
		System.out.println("start from " + arrstart + " end at " + arrend);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;

		findSubarrays(arr, sum);
	}

}

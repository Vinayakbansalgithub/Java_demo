package ArrayQuestions;

public class KadanesAlgorithm {
	public static void main(String[] args) {
		int[] a = { -2,1,-3,4,-1,2,1,-5,4 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	static int maxSubArraySum(int[] arr) {
		// TODO Auto-generated method stub

		int currentSum = 0, overAllSum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (currentSum >= 0) {
				currentSum += arr[i];
			} else {
				currentSum = arr[i];
			}

			if (currentSum > overAllSum)
				overAllSum = currentSum;

		}

		return overAllSum;
	}
}

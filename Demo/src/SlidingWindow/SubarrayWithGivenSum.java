package SlidingWindow;

//https://www.youtube.com/watch?v=Ofl4KgFhLsM&ab_channel=TECHDOSE
public class SubarrayWithGivenSum {

	static void findSubarrays(int[] arr, int sum) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int currentSum = 0;
		int maxLength = 0;

		while (arrstart <= arrend && arrend < arr.length) {

			currentSum += arr[arrend];

			while (currentSum > sum) {
				currentSum = currentSum - arr[arrstart];
				arrstart++;
			}

			if (currentSum == sum) {
				System.out.println("start is " + arrstart + "  end is " + arrend);

				int cSum = 0;
				for (int i = arrstart; i <= arrend; i++) {
					cSum += arr[i];
				}

				System.out.println("======= " + cSum);
				if ((arrend - arrstart + 1) > maxLength)
					maxLength = arrend - arrstart + 1;
			}

			arrend++;

		}

		System.out.println("Max length is " + maxLength);

	}

	public static void main(String[] args) {
		//int[] arr = { 1, 9, 20, 3, 10, 5, 3, 5, 5, 5, 5, 5, 5 ,-5,5};
		
		int arr[] = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};

		int sum = 0;
				//38;

		findSubarrays(arr, sum);
	}

}

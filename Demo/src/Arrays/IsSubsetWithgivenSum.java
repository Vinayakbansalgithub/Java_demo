package Arrays;

//https://www.youtube.com/watch?v=Ofl4KgFhLsM
// continious

public class IsSubsetWithgivenSum {

	public static void naive(int[] arr, int si, int ei, int sum) {

		int sumSoFar = 0;
		int lastIndex=0;
		// Consider all possible pairs and check their sums
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				
				if (sumSoFar == sum) {
					System.out.println("subset found");
					return;
				} else if (sumSoFar < sum) {
					sumSoFar += arr[j];
					lastIndex=j;
				} else {
					sumSoFar = sumSoFar - arr[i];
					break;
				}
			}
		}
	}

	/* Driver program to test above function */
	public static void main(String args[]) {
		int set[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;
		int n = set.length;

		naive(set, 0, n, sum);

	}

}

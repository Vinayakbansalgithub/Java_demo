package Questions;

public class Robbers {
	static int max(int[] arr) {
		// TODO Auto-generated method stub

		int dp[] = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {

			dp[i]= Math.max(dp[i-1], dp[i-2]+arr[i]);
			
			
		}

		return dp[arr.length-1];
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 7, 9, 3, 1 };
		int res = max(arr);
		System.out.println(res);

	}
}

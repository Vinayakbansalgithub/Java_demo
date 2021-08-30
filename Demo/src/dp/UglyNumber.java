package dp;

public class UglyNumber {

	public static void main(String[] args) {
		int num = 14;
		find(num);
	}

	static void find(int num) {
		// TODO Auto-generated method stub

		int[] dp = new int[num + 1];
		dp[1] = 1;

		int p2 = 1, p3 = 1, p5 = 1;
		for (int i = 2; i < dp.length; i++) {

			int f2 = dp[p2] * 2;
			int f3 = dp[p3] * 3;
			int f5 = dp[p5] * 5;

			int min = Math.min(f2, Math.min(f3, f5));
			dp[i] = min;

			if (f2 == min)
				p2++;
			if (f3 == min)
				p3++;
			if (f5 == min)
				p5++;

		}

		System.out.println(dp[num]);

		for (int i : dp) {
			if (i == num) {
				System.out.println(true);
				break;
			}
		}

	}
}

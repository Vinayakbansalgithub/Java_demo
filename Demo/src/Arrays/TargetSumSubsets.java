package Arrays;

import java.util.LinkedList;

// 
public class TargetSumSubsets {
	public static void main(String[] args) {

		int set[] = {4,2,7,1,3};
		int sum = 5;
		result(set, sum);
	}

	private static void result(int[] set, int sum) {
		// TODO Auto-generated method stub

		boolean dp[][] = new boolean[set.length + 1][sum + 1];

		for (int aarValue = 0; aarValue <= set.length; aarValue++) {
			for (int sumVal = 0; sumVal <= sum; sumVal++) {

				if (aarValue == 0 && sumVal == 0) {
					dp[aarValue][sumVal] = true;
				} else if (aarValue == 0) {
					dp[aarValue][sumVal] = false;
				} else if (sumVal == 0) {
					dp[aarValue][sumVal] = true;
				} else {
					if (sumVal < set[aarValue - 1]) {
						if (dp[aarValue - 1][sumVal] == true) {
							dp[aarValue][sumVal] = true;
						} else {
							dp[aarValue][sumVal] = false;
						}
					} else {
						if (dp[aarValue - 1][sumVal] || dp[aarValue - 1][sumVal - set[aarValue - 1]]) {
							dp[aarValue][sumVal] = true;

						}

					}
				}

			}
		}

		System.out.println("ans   " + dp[set.length][sum]);

		class Pair {
			int n;
			int tar;

			String psf;
		}

		LinkedList<Pair> queue = new LinkedList<>();
		Pair pair = new Pair();

		pair.n = set.length;
		pair.tar = sum;

		pair.psf = "";

		queue.addLast(pair);

		while (!queue.isEmpty()) {
			Pair rpair = queue.removeFirst();

			if (rpair.n == 0 || rpair.tar == 0) {

				System.out.println(rpair.psf);
			}

			boolean exc = dp[rpair.n - 1][rpair.tar];
			if (exc) {

				Pair pairL = new Pair();

				pairL.n = rpair.n - 1;
				pairL.tar = rpair.tar;

				pairL.psf = rpair.psf;

				queue.addLast(pairL);

			}

			if (rpair.n >= set[rpair.n - 1]) {
				boolean inc = dp[rpair.n - 1][rpair.tar - set[rpair.n - 1]];
				System.out.println();
				if (inc) {
					Pair pairL = new Pair();

					pairL.n = rpair.n - 1;
					pairL.tar = rpair.tar - set[rpair.n - 1];

					pairL.psf = rpair.psf + " " + set[rpair.n - 1];

					queue.addLast(pairL);
				}
			}

		}

	}
}

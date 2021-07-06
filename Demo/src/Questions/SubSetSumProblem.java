package Questions;

import java.util.Arrays;
import java.util.Iterator;

public class SubSetSumProblem {

	static boolean profitFun(int[] price, int size, int w) {

		boolean arr[][] = new boolean[size + 1][w + 1];

		// If sum is 0, then answer is true
		for (int i = 0; i <= size; i++)
			arr[i][0] = true;

		// If sum is not 0 and set is empty,
		// then answer is false
		for (int i = 1; i <= w; i++)
			arr[0][i] = false;

		for (int row = 1; row <= size; row++) {
			System.out.println();
			for (int col = 1; col <= w; col++) {
				if (price[row - 1] > col) {
					arr[row][col] = arr[row - 1][col];
				} else {
					boolean b1 = arr[row - 1][col];
					boolean b2 = arr[row - 1][col - price[row - 1]];
					boolean res = b1 || b2;
					arr[row][col] = res;

				}

			}
		}
		return arr[size][w];
	}

	public static void main(String[] args) {
		int price[] = new int[] { 2, 3, 8 };
		int W = 5;

		System.out.println(profitFun(price, price.length, W));
	}
}

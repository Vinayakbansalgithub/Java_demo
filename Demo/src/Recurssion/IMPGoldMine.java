package Recurssion;

public class IMPGoldMine {

	private static int getMaxGoldAtLevel(int[][] gold, int r, int c) {
		// TODO Auto-generated method stub

		if (c == 4)
			return 0;

		if (r == -1 || r == 4)
			return 0;

		int aa = getMaxGoldAtLevel(gold, r - 1, c + 1);
		int bb = getMaxGoldAtLevel(gold, r, c + 1);
		int cc = getMaxGoldAtLevel(gold, r + 1, c + 1);

		return Math.max(Math.max(aa, bb), cc) + gold[r][c];

	}

	static int getMaxGold(int[][] gold, int m, int n) {
		// TODO Auto-generated method stub
		int max = 0;

		for (int i = 0; i < m; i++) {
			int res = getMaxGoldAtLevel(gold, i, 0);
			if (res > max)
				max = res;

		}
		return max;
	}

	public static void main(String arg[]) {

		int gold[][] = { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };

		int m = 4, n = 4;

		int res = getMaxGold(gold, m, n);
		System.out.println(res);
	}

}

package Questions;

import java.util.HashSet;

// 36 leetcode
public class IsValidSudoko {
	public static void main(String[] args) {
		char arr[][] = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean res = find(arr);
		System.out.println(res);
	}

	private static boolean find(char[][] arr) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				char curr = arr[i][j];

				if (curr != '.') {
					boolean r1 = set.add(curr + " in row " + i);
					boolean r2 = set.add(curr + " in col " + j);
					boolean r3 = set.add(curr + " in box " + i / 3 + " and col " + j / 3);
					if (!r1 || !r2 || !r3) {

						return false;
					}
				}

			}
		}

		return true;
	}
}

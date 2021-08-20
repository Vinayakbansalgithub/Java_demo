package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		List<ArrayList<Integer>> res=find(5);
		System.out.println(res);
	}

	private static List<ArrayList<Integer>> find(int n) {
		// TODO Auto-generated method stub

		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {

			ArrayList<Integer> rowResult = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++) {

				if (j == 0 || j == i)
					rowResult.add(1);
				else {

					rowResult.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));

				}

			}

			result.add(rowResult);
		}
		
		return result;

	}
}

//         1           0
//        1  1         1
//       1  2  1       2
//     1   3  3  1     3
//        
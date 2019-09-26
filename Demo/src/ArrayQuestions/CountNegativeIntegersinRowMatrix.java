package ArrayQuestions;

public class CountNegativeIntegersinRowMatrix {

	static int count(int r, int c, int[][] a) {
		int count = 0;
		int rowStart = 0;
		int rowEnd = r;
		int columnEnd = c;
		while (rowStart < rowEnd) {
			while (columnEnd > 0 && a[rowStart][columnEnd - 1] > 0) {
				columnEnd--;
			}
			count = count + columnEnd;
			rowStart++;
		}
		return count;
	}
		public static void main(String[] args) {
		int r = 3;
		int c = 4;
		int a[][] = { { -3, -2, 1, 1 }, { -2, 2, 3, 4 }, { 8, 8, 9, 10 } };
		int count = count(r, c, a);
		System.out.println("count is " + count);
		}
}

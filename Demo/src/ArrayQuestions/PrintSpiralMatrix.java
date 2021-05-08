package ArrayQuestions;

public class PrintSpiralMatrix {

	static void spiralPrint(int r, int c, int[][] a) {

		int rowStart = 0;
		int rowEnd = r;
		int columnStart = 0;
		int columnEnd = c;
		int pos = 0;
		while (rowStart <= rowEnd && columnStart <= columnEnd) {
			if (pos == 0) {
				for (int i = columnStart; i <= columnEnd; i++) {
					System.out.println(a[rowStart][i]);
				}
				rowStart++;
			}
			if (pos == 1) {
				for (int i = rowStart; i <= rowEnd; i++) {
					System.out.println(a[i][columnEnd]);
				}
				columnEnd--;
			}

			if (pos == 2) {
				for (int i = columnEnd; i >= columnStart; i--) {
					System.out.println(a[rowEnd][i]);
				}
				rowEnd--;
			}

			if (pos == 3) {
				for (int i = rowEnd; i >= rowStart; i--) {
					System.out.println(a[i][columnStart]);
				}
				columnStart++;
			}
			pos = (pos + 1) % 4;
		}
	}

	public static void main(String[] args) {
		int R = 4;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 } };
		spiralPrint(R - 1, C - 1, a);
	}

}

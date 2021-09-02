package TwoD;


// 130. Surrounded Regions

public class SurroundedRegions {
	public static void main(String[] args) {
		char arr[][] = { { 'X', 'X', 'X', 'X' }, { 'X', '0', '0', 'X' }, { 'X', 'X', '0', 'X' },
				{ 'X', '0', 'X', 'X' } };
		find(arr);
	}

	static void find(char[][] arr) {

		int row = arr.length;
		int col = arr[0].length;

		// row

		for (int j = 0; j < row; j++) {

			if (arr[0][j] == '0') {
				dfs(arr, row, j);
			}
			if (arr[arr.length - 1][j] == '0') {
				dfs(arr, row - 1, j);
			}

		}

		// col
		for (int j = 0; j < col; j++) {

			if (arr[j][0] == '0') {
				dfs(arr, j, 0);
			}
			if (arr[j][arr.length - 1] == '0') {
				dfs(arr, j, arr.length - 1);
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if (arr[i][j] == '0') {
					arr[i][j] ='X';
				}else if (arr[i][j] == '*'){
					arr[i][j] ='0';
				}
			}
		}
		
		System.out.println(arr);

	}

	static void dfs(char[][] arr, int row, int col) {

		if (row < 0 || col < 0 || row > arr.length - 1 || col > arr[row].length - 1) {
			return;
		}

		arr[row][col] = '*';

		if (row > 0 && arr[row - 1][col] == '0')
			dfs(arr, row - 1, col); // t

		if (col < arr[row].length - 1 && arr[row][col + 1] == '0')
			dfs(arr, row, col + 1); // r

		if (row < arr.length - 1 && arr[row + 1][col] == '0')
			dfs(arr, row + 1, col); // d

		if (col > 0 && arr[row][col - 1] == '0')
			dfs(arr, row, col - 1); // l

	}
}

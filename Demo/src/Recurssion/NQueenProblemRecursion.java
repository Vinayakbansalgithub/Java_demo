package Recurssion;

import java.util.Arrays;

public class NQueenProblemRecursion {

	static boolean isSafe(boolean[][] board, int row, int col) {

		int temprow = row;
		int tempcol = col;
		// upper rows
		while (temprow > -1) {
			if (board[temprow][col]) {
				return false;
			}
			temprow--;
		}

		temprow = row;
		tempcol = col;
		// upper right diagonal
		while (temprow != -1 && tempcol != board.length) {

			if (board[temprow][tempcol]) {
				return false;
			}
			temprow--;
			tempcol++;
		}
		temprow = row;
		tempcol = col;
		// upper left diagonal
		while (temprow != -1 && tempcol != -1) {
			if (board[temprow][tempcol]) {
				return false;
			}
			temprow--;
			tempcol--;
		}
		return true;
	}

	static int print(boolean[][] board, int row) {
		int count = 0;

		if (row >= board[0].length) {

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					System.out.print(board[i][j] == true ? "T" + "  " : "F" + "  ");
				}
				System.out.println();
			}

			System.out.println("*----------*");
			return 1;
		}

		for (int col = 0; col < board[row].length; col++) {

			if (isSafe(board, row, col)) {
				board[row][col] = true;

				count = count + print(board, row + 1);
				board[row][col] = false;

			}
		}
		return count;
	}

	public static void main(String[] args) {

		boolean board[][] = new boolean[4][4];
		System.out.println("total arrangements possible: " + print(board, 0));
	}

}

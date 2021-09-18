package Backtracking;

import java.util.Arrays;
import java.util.stream.Stream;

public class NQueenProblemRecursion {

	static boolean isSafe(boolean[][] board, int row, int col) {

		int temprow = row;
		int tempcol = col;
		// upper rows
		while (temprow > -1) {
			if (board[temprow][tempcol]) {
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

	static int find(boolean[][] board, int row, int col) {
		int count = 0;

		// base case
		if (row >= board.length) {
			
			Stream.of(board).map(Arrays::toString).forEach(System.out::println);
			System.out.println("-----------");

			// if we go out of board means we find a solution
			return 1;
		}

		for (int c = 0; c < board[row].length; c++) {

			if (isSafe(board, row, c)) {
				board[row][c] = true;

				count = count + find(board, row + 1, c + 1);
				board[row][c] = false;

			}
		}
		return count;
	}

	public static void main(String[] args) {

		boolean board[][] = new boolean[4][4];
		System.out.println("total arrangements possible: " + find(board, 0, 0));

	}

}

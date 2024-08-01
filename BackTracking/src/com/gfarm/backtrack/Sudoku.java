package com.gfarm.backtrack;

public class Sudoku {

	public static boolean helper(char[][] board, int row, int col) {

		if (row == board.length) {
			printBoard(board, col, col);
			return true;
		}
		int newRow = 0;
		int newCol = 0;
		if (col != board.length - 1) {
			newRow = row;
			newCol = col + 1;
		} else {
			newRow = row + 1;
			newCol = 0;
		}
		if (board[row][col] != '.') {// board is full
			if (helper(board, newRow, newCol)) {
				return true;
			}
		} else { // fill the places
			for (int i = 1; i <= 9; i++) {
				if (isSafe(board, row, col, i)) {
					board[row][col] = (char) (i + '0');
					if (helper(board, newRow, newCol)) {
						return true;
					} else {
						board[row][col] = '.';
					}
				}
			}
		}
		return false;
	}

	private static void printBoard(char[][] board, int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}

	private static boolean isSafe(char[][] board, int row, int col, int number) {
		// row column
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == (char) (number + '0')) {
				return false;
			}
			if (board[row][i] == (char) (number + '0')) {
				return false;
			}
		}
		// grid
		int startingRow = row / 3 * 3;
		int startingCol = col / 3 * 3;

		for (int i = startingRow; i < startingRow + 3; i++) {
			for (int j = startingCol; j < startingCol + 3; j++) {
				if (board[i][j] == (char) (number + '0')) {
					return false;
				}
			}
		}

		return true;
	}

	public static void solveSudoku(char[][] board) {
		helper(board, 0, 0);
	}

	public static void main(String[] args) {
		char[][] board = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		solveSudoku(board);
	}

}

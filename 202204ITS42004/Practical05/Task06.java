package Practical05;

public class Task06 {
	public static int[][] initBoard() {
		int[][] board = new int[3][3];

		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {
				board[i][j] = (int)(Math.random() * 2);
				System.out.print(board[i][j]);  // print each cell as they are made up
			}
			System.out.println();   // print new line character after each row has been fully printed
		}

		return board;
	}

	// check rows (horizontally)
	public static void rows(int[][] board) {
		for (int i = 0; i < board.length; ++i) {
			boolean flag = true;    // flag for if whole row contains same element
			for (int j = 1; j < board[i].length; ++j) {
				// if any element along row does not match first element
				if(board[i][0] != board[i][j]) {
					flag = false;
					break;
				}
			}
			if (flag) System.out.println("All " + board[i][0] + "'s on row " + i);
		}
	}

	// check columns
	public static void columns(int[][] board) {
		for (int i = 0; i < board.length; ++i) {
			boolean flag = true;    // flag for if whole column contains same element
			for (int j = 1; j < board[i].length; ++j) {
				// if any element along column does not match first element
				if(board[0][i] != board[j][i]) {
					flag = false;
					break;
				}
			}
			if (flag) System.out.println("All " + board[0][i] + "'s on column " + i);
		}
	}

	/**
	 * [0,0]    [0,1]   [0,2]
	 * [1,0]    [1,1]   [1,2]
	 * [2,0]    [2,1]   [2,2]
	 */

	// check major diagonal (diagonal from top left to bottom right of square matrix)
	public static boolean majorDiagonal(int[][] board) {
		for (int i = 1; i < board.length; ++i) {
			if(board[0][0] != board[i][i])  // if any element along major diagonal does not match first element
				return false;
		}
		return true;
	}

	// check sub-diagonal (diagonal from top right to bottom left of square matrix)
	public static boolean subDiagonal(int[][] board) {
		for (int i = 1; i < board.length; ++i) {
			// if any element along sub-diagonal does not match first element
			if (board[0][board.length - 1] != board[i][board[i].length - i - 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("TicTacToe board:");
		int[][] board = initBoard();

		System.out.println("\nResult(s):");
		rows(board);
		columns(board);
		if (majorDiagonal(board)) System.out.println("All " + board[0][0] + "'s on major diagonal");
		if (subDiagonal(board)) System.out.println("All " + board[0][0] + "'s on sub-diagonal");
	}
}

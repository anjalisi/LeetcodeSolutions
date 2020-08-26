package com.challenge;

public class SurroundedRegions {
	static int rows, cols;
    public void solve(char[][] board) {
    if (board == null || board.length == 0) return ;
     
   rows = board.length;
    cols = board[0].length;
   
    for (int i = 0; i < rows; i++) {
        dfs(board, i, 0);
        dfs(board, i, cols - 1);
    }
    for (int j = 0; j < cols; j++) {
        dfs(board, 0, j);
        dfs(board, rows - 1, j);
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (board[i][j] == 'O') board[i][j] = 'X';
        if (board[i][j] == 'A') board[i][j] = 'O';
      }
    }
  }

  protected void dfs(char[][] board, int row, int col) {
    if(row < 0 || row > this.rows - 1 || col < 0 || col > this.cols - 1 || board[row][col] != 'O') return ;

    board[row][col] = 'A';
    dfs(board, row, col + 1);
    dfs(board, row + 1, col);
    dfs(board, row, col - 1);
    dfs(board, row - 1, col);
  }
}

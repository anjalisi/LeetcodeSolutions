package treeesss;

public class BattleshipsOnBoard {
    public int countBattleships(char[][] board) {
        //Same as counting islands

        int count=0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='X'){
                    count++;
                    dfs(board, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] board, int i, int j) {
        if(i<0 || j<0 || i>=board.length || j>=board[i].length || board[i][j]!='X')
            return;
        
        //Mark the element
        board[i][j]='.';
        //Traverse the neighbours
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1); 
    }
}

package com.medium;

import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board)
    {
        //We use a hashset to store only the unique values across
        // rows, columns, sub matrix
        HashSet<String> seen_element= new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char curr= board[i][j];
                if(curr!='.')
                //The add method in hashset returns false if the element is not present in the hashset, and true if it is.
                if(!seen_element.add(curr+" row "+i) ||
                    !seen_element.add(curr+" col "+j) ||
                    !seen_element.add(curr+" submat "+i/3+"-"+j/3))
                    return false;
            }
        }
        return true;
    }
}
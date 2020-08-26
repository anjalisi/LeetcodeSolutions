package com.easy;

public class AlphabetBoard {
    public String alphabetBoardPath(String target)
    {
    	int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : target.toCharArray()){
            int val = c - 'a';
            int row = val / 5;
            int col = val % 5;
            while(j > col){
                j--;
                sb.append('L');
            }
            while(i > row){
                i--;
                sb.append('U');
            }
            while(j < col){
                j++;
                sb.append('R');
            }
            while(i < row){
                i++;
                sb.append('D');
            }
            sb.append('!');
        }
        return sb.toString();
     }
}

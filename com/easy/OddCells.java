package com.easy;

public class OddCells {
    public int oddCells(int n, int m, int[][] indices) 
    {
    	//int[] arr= new int[n][m];
    	int row[] = new int[n], col[] = new int[m], res = 0;
        for (int[] idx : indices) {
            row[idx[0]]++;
            col[idx[1]]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((row[i] + col[j]) % 2 == 1) res++;
            }
        }
        return res;
    }
}

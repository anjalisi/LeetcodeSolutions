package com.mathProbs;

import java.util.Arrays;

public class MinMovestoMakeArrayEqual {
    public static int minMoves(int[] nums) 
    {
    	int min = Integer.MAX_VALUE, moves = 0;
        for (int i : nums) min = Math.min(min, i);
        for (int i = 0; i < nums.length; i++) moves += (nums[i] - min);
        return moves;
    }
    public static void main(String[] args) {
    	int nums[]= {1,1,2147483647};
    	System.out.println(minMoves(nums));
	}
}

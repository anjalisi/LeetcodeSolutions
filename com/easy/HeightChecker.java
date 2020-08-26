package com.easy;

import java.util.PriorityQueue;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        PriorityQueue<Integer> n=new PriorityQueue<Integer>();
        for(int i=0; i<heights.length; i++)
        	n.add(heights[i]);
        int res=0;
        for(int i=0; i<heights.length; i++)
        	if(n.poll()!= heights[i])
        		res++;
        return res;
    }
}

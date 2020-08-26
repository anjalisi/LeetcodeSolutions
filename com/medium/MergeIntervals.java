package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        //Sorting based on both arrays 1st element
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//        
//        Stack<int[]> stack = new Stack<>();
//        stack.push(intervals[0]);
//        
//        for (int i = 1; i < intervals.length; i++) {
//            int[] topInt = stack.peek();
//            int[] curInt = intervals[i];
//            
//            if (topInt[1] >= curInt[0]) {
//                int start = topInt[0];
//                int end = Math.max(topInt[1], curInt[1]);
//                stack.pop();
//                stack.push(new int[]{start, end});
//            }
//            else {
//                stack.push(curInt);
//            }
//        }
//        
//        int size = stack.size();
//        int[][] result = new int[size][2];
//        int i = size - 1;
//        while (!stack.isEmpty()) {
//            int[] top = stack.pop();
//            result[i][0] = top[0];
//            result[i][1] = top[1];
//            i--;
//        }
//     
        
        List<int[]> result= new ArrayList<int[]>();
        //Take the first interval and add it to the result
        int[] curr = intervals[0];
        result.add(curr);
        
        for(int[] arr:intervals)
        {
        	int currBegin = curr[0];
        	int currEnd= curr[1];
        	int nextBegin= arr[0];
        	int nextEnd= arr[1];
        	
        	if(currEnd >= nextBegin)
        	{
        		//By changing the ending value in curr, it will automatically
				//change in the result
				
				
        		curr[1]= Math.max(currEnd, nextEnd);
        	}
        	else
        	{
        		//There is no overlap, so we will update the current
        		curr= arr;
        		result.add(curr);
        	}
        }
        
        return result.toArray(new int[result.size()][]);
    }
}

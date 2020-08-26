package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDiff {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDist = Math.abs(arr[1] - arr[0]);
        
        for(int i=1; i<arr.length-1; i++)          //finding min distance
            if(minDist > Math.abs(arr[i+1] - arr[i]))
                minDist = Math.abs(arr[i+1] - arr[i]);
        
        for(int i=0; i<arr.length-1; i++)          //looping through the array to find pairs having same distance
            if(Math.abs(arr[i+1] - arr[i]) == minDist)
                list.add(Arrays.asList(arr[i], arr[i+1]));
        
        return list;
    }
}

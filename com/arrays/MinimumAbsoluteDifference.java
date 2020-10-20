package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(arr);

        int minDiff= Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            minDiff= Math.min(arr[i]-arr[i-1], minDiff);
        }   

        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1]== minDiff)
                result.add(Arrays.asList(arr[i], arr[i-1]));
        }
        return result;
    }
}

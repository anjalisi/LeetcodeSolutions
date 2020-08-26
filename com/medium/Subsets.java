package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> results= new ArrayList<>();
        if(nums==null || nums.length==0)
        	return results;
        Arrays.sort(nums);
        List<Integer> subset= new ArrayList<Integer>();
        toFindAllSubsets(nums, results,subset, 0);//start index 0
        
        return results;
    }

	private void toFindAllSubsets(int[] nums, List<List<Integer>> results, List<Integer> subset, int start) {
		results.add(new ArrayList<>(subset));	//since our subset changes with every call, we need to make a new one each time
		
		for(int i=start; i<nums.length; i++)
		{
			subset.add(nums[i]);
			toFindAllSubsets(nums, results, subset,i+1); //going to next index
			subset.remove(subset.size()-1);	//reaches back to the for loop
		}
		
	}
}

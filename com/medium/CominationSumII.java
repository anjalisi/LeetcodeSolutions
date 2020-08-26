package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CominationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
    	List<List<Integer>> res= new ArrayList<>();
    	Arrays.sort(candidates); //To deal with duplicates
    	findAllCombinations(candidates, target, res, 0, new ArrayList<Integer>());
    	return res;
    }

	private void findAllCombinations(int[] candidates, int target, List<List<Integer>> res,
			int index, ArrayList<Integer> current) 
	{
		//Base case
		if(target==0)
		{
			res.add(new ArrayList<>(current));
			return;
		}
		if(target<0)
			return;
		for(int i=index; i<candidates.length; i++)
		{
			if(i==index || candidates[i]!=candidates[i-1])
			{
				current.add(candidates[i]);
				findAllCombinations(candidates, target-candidates[i], res, i+1, current);
				current.remove(current.size()-1);
			}
		}
	}
}

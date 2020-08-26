package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
    	List<List<Integer>> res= new ArrayList<>();
    	if(candidates.length==0)
    		return res;
    	Arrays.sort(candidates);
    	List<Integer> combo= new ArrayList<>();
    	helper(res, combo, target,candidates, 0);
    	return res;
    }

	private void helper(List<List<Integer>> res, List<Integer> combo, int target, int[] candidates, int start) {
		if(target==0)
		{
			res.add(new ArrayList<>(combo));
			return;
		}
		for(int i=start; i<candidates.length;i++)
		{
			if(target<candidates[i])
				break;
			combo.add(candidates[i]);
			helper(res, combo, target-candidates[i], candidates, i);
			combo.remove(combo.size()-1);
		}
	}
}

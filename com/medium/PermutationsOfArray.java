package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfArray {
    public static List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> res= new ArrayList<List<Integer>>();
    	if(nums==null || nums.length==0) return res;
    	boolean[] used= new boolean[nums.length];
    	Arrays.sort(nums);
    	List<Integer> permutation = new ArrayList<Integer>();
    	helper(used, nums, permutation, res);
    	return res;
    }
    private static void helper(boolean[] used, int[] nums, List<Integer> permutation, List<List<Integer>> res) {
		if(permutation.size()==nums.length)
		{
			res.add(new ArrayList<Integer>(permutation));
			return;
		}
		
		for(int i=0; i<nums.length; i++)
		{
			if(used[i]) continue;
			used[i]=true;
			permutation.add(nums[i]);
			helper(used, nums, permutation, res);
			permutation.remove(permutation.size()-1);
			used[i]=false;
			/*Removing duplicates
			 * while(i<nums.length-1 && nums[i]==nums[i+1]) continue;
			 * 
			 * */
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3};
		System.out.println(permute(nums));
	}
}

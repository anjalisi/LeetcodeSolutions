package com.medium;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) 
    {
    	List<String> ans=new ArrayList<>();
		int i=0;
		while(i<nums.length){
			StringBuilder temp=new StringBuilder();
			temp.append(nums[i]);
			int t=i;
			while(i+1<nums.length && Math.abs(nums[i+1]-nums[i])==1){
				i++;
			}
			if(t!=i)    
				temp.append("->"+nums[i]);
			ans.add(temp.toString());
			i++;
		}
		return ans;
    }
}

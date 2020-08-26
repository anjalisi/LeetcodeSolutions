package com.medium;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
     /*MAIN IDEA
      * 1. We use double the array (A+A) and do the same as in next Greater Element 1
      * */   
    	int[] output= new int[nums.length];
    	Stack<Integer> st= new Stack<Integer>();
    	Arrays.fill(output, -1);
    	for(int i=0; i<2*nums.length; i++)
    	{
    		while(!st.isEmpty() && nums[st.peek()] < nums[i%nums.length])
    		{
    			output[st.pop()]=nums[i%nums.length];
    		}
    			//We make a indexed stack
    		if(i<nums.length) st.push(i);
    	}
    	return output;
    	
    }
}

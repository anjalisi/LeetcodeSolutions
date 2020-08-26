package com.easy;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
    	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
    	Stack<Integer> st= new Stack<Integer>();
    	for(int num: nums2)
    	{
    		//Map the next greatest value to each element
    		while(!st.isEmpty() && st.peek() <num)
    			map.put(st.pop(), num);
    		st.push(num);
    	}
    	
    	for(int i=0; i<nums1.length; i++)
    	{
    		nums1[i]= map.getOrDefault(nums1[i],-1);
    		System.out.println(nums1[i]+map.getOrDefault(nums1[i],-1));
    	}
    	return nums1;
    }
}

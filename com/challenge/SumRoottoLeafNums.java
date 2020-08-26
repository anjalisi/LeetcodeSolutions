package com.challenge;

public class SumRoottoLeafNums {
    public int sumNumbers(TreeNode root) 
    {
    	return sumNumbersUtil(root,0);
    }
    public int sumNumbersUtil(TreeNode root,int val)
    {
    	if(root==null)
    		return 0;
    	val= (val*10)+root.val;
    	if(root.left==null && root.right==null)
    		return val;
    	return sumNumbersUtil(root.left, val)+sumNumbersUtil(root.right, val);
    }
}

package com.easy;

import treeesss.TreeNode;

public class UnivaluedTree {
    public boolean isUnivalTree(TreeNode root) 
    {
    	if(root==null) return true;
    	boolean leftSide= root.left==null || root.left.val==root.val && isUnivalTree(root.left);

    	boolean rightSide= root.right==null || root.right.val==root.val && isUnivalTree(root.right);
    	
    	return leftSide && rightSide;		
    }
}

package com.medium;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) 
    {
    	if(root==null) return;
    	
    	Stack<TreeNode> stack= new Stack<TreeNode>();
    	stack.push(root);
    	
    	while(!stack.isEmpty())
    	{
    		TreeNode curr= stack.pop();
    		//We want the left node first, so we will add it later
    		//Because, stack uses LIFO
    		if(curr.right !=null)
    			stack.push(curr.right);
    		if(curr.left !=null)
    			stack.push(curr.left);
    		
    		//Now we will change it to a linked list
    		if(!stack.isEmpty())
    			curr.right=stack.peek();	//We will set every node to the right side
    		//And now we will set the left pointer to null
    		curr.left=null;
    	}
    }
}

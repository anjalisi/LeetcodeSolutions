package com.medium;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLevelSum {
    public int deepestLeavesSum(TreeNode root) 
    {
    	//We need to do level order traversal and calculate the sum
    	//of each level and return the val of last level
    	
    	Queue<TreeNode> queue= new LinkedList<TreeNode>();
    	if(root== null) return 0;
    	queue.offer(root);
    	
    	int levelSum=0;
    	
    	while(!queue.isEmpty())
    	{
    		levelSum=0;
    		int size=queue.size();
    		for(int i=0; i<size; i++)
    		{
    			TreeNode node = queue.poll();
    			levelSum += node.val;
    			if(node.left != null)
    				queue.offer(node.left);
    			if(node.right != null)
    				queue.offer(node.right);
    		}
    	}
    	return levelSum;
    }
}

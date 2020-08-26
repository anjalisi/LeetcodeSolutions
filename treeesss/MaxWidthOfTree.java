package treeesss;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfTree {
    int maxWidth;
    //We make a hashmap which stores the lftmost node of each level
    HashMap<Integer, Integer> leftMost;
	public int widthOfBinaryTree(TreeNode root) 
    {
    	maxWidth=0;
    	leftMost= new HashMap<Integer, Integer>();
    	getWidth(root, 0,0);
    	return maxWidth;
    }
	private void getWidth(TreeNode root, int pos, int depth)
	{
		if(root==null) return;
		
		leftMost.computeIfAbsent(depth, x->pos);
		maxWidth= Math.max(maxWidth, pos-leftMost.get(depth)+1);
		
		getWidth(root.left, 2*pos, depth+1);
		getWidth(root.right, 2*pos+1, depth+1);
	}
}

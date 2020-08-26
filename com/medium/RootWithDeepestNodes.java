package com.medium;
class TreeNode {
	   int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
public class RootWithDeepestNodes 
{
    public TreeNode subtreeWithAllDeepest(TreeNode root) 
    {
    	if(root==null)
    		return null;
    	int ldept= getDept(root.left);
    	int rdept=getDept(root.right);
    	
    	if(ldept==rdept)
    		return root;
    	else
    	{
    		if(ldept>rdept)
    			return subtreeWithAllDeepest(root.left);
    		else
    			return subtreeWithAllDeepest(root.right);
    	}
    				
    }

	private int getDept(TreeNode node) {
		if(node==null)
			return 0;
		return 1+Math.max(getDept(node.left), getDept(node.right));
	}
}

package treeesss;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
    	if(root1==null && root2==null)
    		return true;
    	if(root1==null || root2 ==null)
    		return false;
    	
    	//Make 2 stacks to store the values while traversing
    	Stack<TreeNode> stack1= new Stack<TreeNode>();
    	Stack<TreeNode> stack2= new Stack<TreeNode>();
    	
    	Queue<TreeNode> res= new LinkedList<TreeNode>();
    	
    	stack1.push(root1);
    	while(!stack1.isEmpty())
    	{
    		TreeNode temp= stack1.pop();
    		//if the node is leaf node
    		if(temp.left== null && temp.right==null)
    			res.add(temp);
    		
    		if(temp.left != null)
    			stack1.push(temp.left);
    		
    		if(temp.right != null)
    			stack1.push(temp.right);
    	}
    	stack2.push(root2);
    	while(!stack2.isEmpty())
    	{
    		TreeNode temp= stack2.pop();
    		//if the node is leaf node
    		if(temp.left== null && temp.right==null)
    		{
    			if(res.peek().val != temp.val)
    				return false;
    			else
    				res.poll();
    		}
    		
    		if(temp.left != null)
    			stack2.push(temp.left);
    		
    		if(temp.right != null)
    			stack2.push(temp.right);
    	}
    	return res.isEmpty();
    }
}

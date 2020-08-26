package treeesss;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigZagTraversal 
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
    	List<List<Integer>> res= new ArrayList<List<Integer>>();
    	if(root==null)
    		return res;
    	
    	//Make 2 stacks, one stores from Right to left, next from left to right
    	Stack<TreeNode> stack1= new Stack<TreeNode>();
    	Stack<TreeNode> stack2= new Stack<TreeNode>();
    	
    	//Push first node on stack1
    	stack1.push(root);
    	//This stores the traversal of each level
    	List<Integer> temp= new ArrayList<Integer>();
    	
    	while(!stack1.isEmpty() || !stack2.isEmpty())
    	{
    		while(!stack1.isEmpty())
    		{
    			TreeNode curr= stack1.pop();
    			temp.add(curr.val);
    			
    			if(curr.left != null)
    				stack2.push(curr.left);
    			if(curr.right != null)
    				stack2.push(curr.right);
    		}
    		if(!temp.isEmpty())
    			res.add(new ArrayList<Integer>(temp));
    		//Clear the list after every iteration
    		temp.clear();
    		while(!stack2.isEmpty())
    		{
    			TreeNode curr= stack2.pop();
    			temp.add(curr.val);

    			if(curr.right != null)
    				stack1.push(curr.right);
    			if(curr.left != null)
    				stack1.push(curr.left);
    		}
    		if(!temp.isEmpty())
    			res.add(new ArrayList<Integer>(temp));
    		//Clear the list after every iteration
    		temp.clear();	
    	}
    	return res;
    }
}

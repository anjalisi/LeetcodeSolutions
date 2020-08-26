package treeesss;

import java.util.Stack;
public class ValidBST 
{
	
    public boolean isValidBST(TreeNode root) 
    {
    	Stack<TreeNode> stack= new Stack<TreeNode>();
    	double leftChild= -Double.MAX_VALUE;
    	
    	while(!stack.isEmpty() || root!= null)
    	{
    		while(root!= null)
    		{
    			//Pushing the parent nodes or left child into the stack
    			//until we reach the leftmost node
    			stack.push(root);
    			root= root.left;
    		}
    		//pop the most recent node and check if it is greater than the 
    		//left child or not.
    		root = stack.pop();
    		if(root.val <= leftChild)
    			return false;
    		//Update the left child after every iteration
    		leftChild = root.val;
    		//Checking  the same for right side
    		root= root.right;
    	}
    	return true;
    }
	
}

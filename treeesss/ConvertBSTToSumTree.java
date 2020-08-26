package treeesss;

import java.util.Stack;

public class ConvertBSTToSumTree {
    public TreeNode bstToGst(TreeNode root) 
    {
    	/* MAIN IDEA
    	 * 1. Put all the nodes in one stack
    	 * 2. Pop the values from that stack and add that value to the new stack(by taking the sum of the 2)
    	 * 3. Put these values in the tree
    	 * */
    	if(root==null) return root;
    	Stack<Integer> stack = new Stack<Integer>();
    	//Adding the values to the stack
    	inOrder(stack, root);
    	Stack<Integer> stackSum = new Stack<Integer>();
    	while(!stack.isEmpty())
    	{
    		if(stackSum.isEmpty())
    			stackSum.push(stack.pop());
    		else
    		{
    			stackSum.push(stack.pop()+stackSum.peek());
    		}
    	}
    	//Now we need to update the values of the tree
    	update(stackSum, root);
    	return root;
    }

	private void update(Stack<Integer> stack, TreeNode root) {
		if(root==null) return;
		update(stack,root.left);
		root.val=stack.pop();
		update(stack,root.right);
	}

	private void inOrder(Stack<Integer> stack, TreeNode root) {
		if(root==null) return;
		inOrder(stack,root.left);
		stack.push(root.val);
		inOrder(stack,root.right);
	}
}

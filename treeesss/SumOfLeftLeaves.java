package treeesss;

public class SumOfLeftLeaves 
{
    public int sumOfLeftLeaves(TreeNode root)
    {
    	if(root==null)
    		return 0;
    	//Checking if the current node has a left, and is that child a leaf node
    	else if(root.left != null && root.left.left == null && root.left.right== null)
    		return root.left.val += sumOfLeftLeaves(root.right);	//Recursing for the right subtree, to find the left leaf child there
    	else
    		return sumOfLeftLeaves(root.left) +sumOfLeftLeaves(root.right);
    }
}

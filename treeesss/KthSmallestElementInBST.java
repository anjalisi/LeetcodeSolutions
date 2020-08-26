package treeesss;

import javax.swing.tree.TreeNode;

public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) 
    {
    	//We need to do an inorder traversal in the tree as it gives us the sorted 
    	//order of the tree elements
    	int[] nums= new int[2];
    	//nums[0] keeps track on the current element
    	//nums[1] helps in storing the result
    	inorder(root, nums, k);
    	return nums[1];
    }

	private void inorder(TreeNode root, int[] nums, int k) 
	{
		if(root== null)
			return;
		inorder(root.left, nums, k);
		//Checking if it is the node we need
		if(++nums[0]==k)
		{
			nums[1]=root.val;
			return;
		}
		inorder(root.right, nums, k);
	}
}

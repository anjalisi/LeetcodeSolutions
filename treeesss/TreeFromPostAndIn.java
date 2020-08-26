package treeesss;

public class TreeFromPostAndIn {
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
    	return helper(inorder, postorder, 0, inorder.length-1, postorder.length-1);
    }

	TreeNode helper(int[] inorder, int[] postorder, int instart, int inend, int postend) {
		if(postend<0 ||instart>inend) return null;
		//The root will always be at the end
		TreeNode root= new TreeNode(postorder[postend]);
		int i=instart;
		//Now we need to find the index in inorder (items on the left are left subtree, right are right subtree)
		for(; i<inend; i++)
		{
			if(inorder[i]==root.val)
				break;
		}
		//Now all that is left is recursing on the left and the right subtree
		root.left=helper(inorder, postorder, instart, i-1, postend-1+i-inend);
		root.right=helper(inorder, postorder, i+1, inend, postend-1);
		return root;
	}
}

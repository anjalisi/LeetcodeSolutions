package treeesss;

import java.util.Stack;


public class ConstructTreeFromPreorderInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
    	return buildTreeAll(0,0,inorder.length-1, preorder,inorder);
    }

	private TreeNode buildTreeAll(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
		if(preStart > preorder.length || inEnd < inStart)
			return null;
		TreeNode root= new TreeNode(preorder[preStart]);
		//Find the node in the inorder
		int inIndex=0;
		for(int i= inStart; i<= inEnd; i++)
		{
			if(inorder[i] == root.val)
			{
				inIndex= i;
				break;
			}
		}
		//Traverse for the right and left side
		root.left= buildTreeAll(preStart+1, inStart, inIndex-1, preorder, inorder);
		//We have to skip the left subtrees
		root.right= buildTreeAll(preStart + inIndex- inStart +1, inIndex+1, inEnd, preorder, inorder);
		return root;
	}
}

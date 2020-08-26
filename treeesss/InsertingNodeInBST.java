package treeesss;

public class InsertingNodeInBST 
{
    public TreeNode insertIntoBST(TreeNode root, int val) 
    {
    	if(root == null)
    		return (new TreeNode(val));
    	if(root.val < val && (root.right != null))
    		insertIntoBST(root.right,val);
    	else if(root.val < val)
    		root.right = new TreeNode(val);
    	else if(root.val > val && (root.left != null))
    		insertIntoBST(root.left,val);
    	else if(root.val > val)
    		root.left = new TreeNode(val);
    	return root;
    }
}

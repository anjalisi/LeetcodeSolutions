package treeesss;

public class LCAofBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
    	if(root== null)
    		return null;
    	
    	if(root.val ==p.val || root.val==q.val)
    		return root;
    	
    	TreeNode leftSearch= lowestCommonAncestor(root.left, p, q);
    	TreeNode rightSearch= lowestCommonAncestor(root.right, p, q);
    	
    	if(leftSearch == null)
    		return rightSearch;
    	if(rightSearch==null)
    		return leftSearch;
    	
    	return root;
    	
    }
}

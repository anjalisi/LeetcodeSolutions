package treeesss;

public class LowestCommonAncestorsInBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
    	//both lie on the left side
    	if(p.val < root.val && q.val < root.val)
    		return lowestCommonAncestor(root.left, p, q);
    	//both lie on the right side
    	if(p.val > root.val && q.val  > root.val)
    		return lowestCommonAncestor(root.right, p, q);
    	//both lie on the different side of the tree, so this is the node we are looking for
    	else
    		return root;
    }
}

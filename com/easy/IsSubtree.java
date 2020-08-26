package com.easy;

public class IsSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) 
    {
    	if(t==null)
    		return true;
    	if(s==null)
    		return false;
    	if(isIdentical(s,t))
    		return true;
    	
    	return isSubtree(s, t.left) || isSubtree(s, t.right); 
    }

	private boolean isIdentical(TreeNode s, TreeNode t) {
		if(s==null && t==null)
			return true;
		if(s==null || t==null)
			return false;
		
		return (s.data == t.data && isIdentical(s.left, t.left) && isIdentical(s.right, t.right));
	}
}

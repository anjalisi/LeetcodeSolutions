package com.easy;

import javax.swing.tree.TreeNode;

public class TreeToString {
    public String tree2str(TreeNode t) {
        StringBuilder res= new StringBuilder();
        preOrdering(t, res);
        return res.toString();
    }

	private void preOrdering(TreeNode t, StringBuilder res) 
	{
		if(t!= null)
		{
			res.append(t.val);
			if(t.left != null)
			{
				res.append("(");
				preOrdering(t.left, res);
				res.append(")");
			}
			else if(t.left==null && t.right != null)
				res.append("()");
			if(t.right != null)
			{
				res.append("(");
				preOrdering(t.right, res);
				res.append(")");
			}
		}
		
	}
}

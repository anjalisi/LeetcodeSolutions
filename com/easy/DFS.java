package com.easy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class DFS {
    public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> res= new ArrayList<String>();
        traverse(res, root, "");
        return res;
    }

	private void traverse(List<String> res, TreeNode root, String path) 
	{
		if(root==null)	//Breaking condition
			return;
		
		if(root.left==null && root.right ==null)
		{
			res.add(path+root.val);
			return;
		}
		traverse(res, root.left,path+root.val+"->");
		traverse(res, root.right,path+root.val +"->");
		
	}
}

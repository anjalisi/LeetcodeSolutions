package com.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class ReverseOrderTraversal 
{
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
		if(root==null)
			return result;
		
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.offer(root);	//Adding root as initial value
		
		while(!q.isEmpty())
		{
			int size= q.size();
			List<Integer> temp= new ArrayList<Integer>();
			for(int i=0; i<size; i++)
			{
				TreeNode node= q.poll();
				
				temp.add(node.val);
				if(node.left != null)
					q.offer(node.left);
				if(node.right != null)
					q.offer(node.right);
				
			}
			result.addFirst(temp);
		}
		return result;
	}
}

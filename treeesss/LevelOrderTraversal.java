package treeesss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        if(root == null)
        	return new ArrayList<List<Integer>>();
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        
        //Add the first node in the queue
        queue.add(root);
        while(!queue.isEmpty())
        {
        	//Traverse the child nodes and store it into a Arraylist (for each level)
        	List<Integer> level= new ArrayList<Integer>();
        	int size= queue.size();
        	
        	//We start the loop from 1 because we have already taken into account the 
        	//first node
        	for(int i=1; i<=size; i++)
        	{
        		TreeNode temp= queue.poll();
        		//Add this node to the level
        		level.add(temp.val);
        		//Add the left and right child on the queue
        		if(temp.left != null)
        			queue.add(temp.left);
        		if(temp.right != null)
        			queue.add(temp.right);
        	}
        	result.add(level);
        }
        return result;
    }
}

package treeesss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxValueInEachRow 
{
    public List<Integer> largestValues(TreeNode root) 
    {
    	if(root== null)
    		return new ArrayList<Integer>();
    	
    	Queue<TreeNode> queue= new LinkedList<TreeNode>();
    	List<Integer> res= new ArrayList<Integer>();
    	
    	queue.add(root);
    	while(!queue.isEmpty())
    	{
    		int size= queue.size();
    		int maxVal= Integer.MIN_VALUE;
    		for(int i=0; i<size; i++) 
    		{
        		TreeNode temp= queue.poll();
        		maxVal= Math.max(maxVal, temp.val);
        		
        		if(temp.left != null)
        			queue.add(temp.left);
        		if(temp.right != null)
        			queue.add(temp.right);
    		}
    		res.add(maxVal);
    	}
    	return res;
    }
}

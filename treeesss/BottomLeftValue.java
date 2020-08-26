package treeesss;

import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftValue {
    public int findBottomLeftValue(TreeNode root) 
    {
    	Queue<TreeNode> queue= new LinkedList<TreeNode>();
    	queue.offer(root);
    	
    	while(!queue.isEmpty())
    	{
    		root= queue.poll();
    		if(root.right != null)
    			queue.add(root.right);
    		if(root.left != null)
    			queue.add(root.left);
    	}
    	return root.val;
    }
}

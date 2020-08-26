package treeesss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class RightSideTraversal {
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> result= new ArrayList<Integer>();
        if(root== null)
        	return result;
        //We will add all the roots at the same level in this queue
        Queue<TreeNode> q= new LinkedList<TreeNode>();	
        q.add(root);
        while(!q.isEmpty())
        {
        	int size= q.size();
        	for(int i=0; i<size; i++)
        	{

            	TreeNode temp= q.remove();
        		//we only need to add those elements which at the right,
        		//i.e. the last element in the queue
        		if(i==size-1)
        			result.add(temp.val);
        		
        		//continuing with our bfs
        		if(temp.left != null)
        			q.add(temp.left);
        		if(temp.right != null )
        			q.add(temp.right);
        	}
        }
        return result;
    }
}

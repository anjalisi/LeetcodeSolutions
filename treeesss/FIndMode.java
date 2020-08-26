package treeesss;

import java.util.ArrayList;
import java.util.List;

public class FIndMode {
	Integer prev=null;
	int count=1;
	int max=0;
    public int[] findMode(TreeNode root) 
    {
    	List<Integer> list= new ArrayList<Integer>();
    	traverse(root, list);
    	
    	int[] res= new int[list.size()];
    	for(int i=0; i<res.length; i++)
    		res[i]= list.get(i);
    	
    	return res;
    }
	private void traverse(TreeNode root, List<Integer> list)
	{
		//We will use inorder recursive traversal because it gives us a sorted form
		if(root==null)
			return;
		
		traverse(root.left, list);
		if(prev != null)
		{
			if(prev==root.val)
				count++;
			else
				count=1;
		}
		if(count > max)
		{
			max=count;
			list.clear();
			list.add(root.val);
		}
		else if(count == max)
			list.add(root.val);
		prev=root.val;
		traverse(root.right, list);
	}
}

package treeesss;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> result=new ArrayList<Integer>();
        if(root==null)
        	return result;
        preorder(root, result);
        return result;
    }

	private void preorder(TreeNode root, List<Integer> result) {
		if(root== null)
			return;
		//First we will process the node
		result.add(root.val);
		
		//Traverse left, then right
		preorder(root.left, result);
		preorder(root.right, result);
	}
}

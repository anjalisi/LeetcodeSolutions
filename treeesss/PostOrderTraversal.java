package treeesss;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class PostOrderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> result=new ArrayList<Integer>();
        if(root==null)
        	return result;
        postorder(root, result);
        return result;
    }

	private void postorder(TreeNode root, List<Integer> result) {
		if(root== null)
			return;

		//First traverse left, then right
		postorder(root.left, result);
		postorder(root.right, result);
		//Add the root value
		result.add(root.val);
		
	}
}

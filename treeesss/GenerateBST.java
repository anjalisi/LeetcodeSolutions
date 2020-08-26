package treeesss;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class GenerateBST {
    public List<TreeNode> generateTrees(int n)
    {
    	if(n<1)
    		return new ArrayList<TreeNode>();
    	return generateTreeAll(1,n);
    }

	private List<TreeNode> generateTreeAll(int low, int high) 
	{
		List<TreeNode> result= new ArrayList<TreeNode>();
		//Breaking condition 
		if(low > high)
		{
			result.add(null);
			return result;
		}
		for(int i=low; i<= high; i++)
		{
			List<TreeNode> leftNode= generateTreeAll(low, i-1);
			List<TreeNode> rightNode= generateTreeAll(i+1, high);
			for(TreeNode left: leftNode)
			{
				for(TreeNode right: rightNode)
				{
					TreeNode node= new TreeNode(i);
					node.left= left;
					node.right= right;
					result.add(node);
				}
			}
		}
		return result;
	}
}

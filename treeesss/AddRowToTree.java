package treeesss;

import java.util.LinkedList;
import java.util.Queue;

public class AddRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
    	//Checking if we have to add at the first position
    	if(d==1)
    	{
    		TreeNode newNode= new TreeNode(v);
    		//Attaching the node to the left of the new Node, and making
    		//new Node as the root
    		newNode.left= root;	
    		return newNode;
    	}
    	//Else we need to get the values at the depth d, and then insert the value
    	Queue<TreeNode> queue= levelReach(root,d);
    	//Now just add the value at this node and update the left and right
    	while(!queue.isEmpty())
    	{
    		TreeNode curr= queue.poll();
    		//Making the new left and right nodes
    		TreeNode newLeft= new TreeNode(v);
    		TreeNode newRight= new TreeNode(v);
    		//Now we will update the links
    		//first join the new nodes to the left and right of the current node's children
    		newLeft.left = curr.left;
    		newRight.right = curr.right;
    		//Now attach these new Nodes to the current node
    		curr.left= newLeft;
    		curr.right= newRight;
    	}
    	return root;
    }

	private Queue<TreeNode> levelReach(TreeNode root, int d) {
		//Do a normal BFS to reach that level
		Queue<TreeNode> queue= new LinkedList<TreeNode>();
		queue.add(root);
		
		int currDepth=1;
		
		//Go only till d-1, we want the parent below which we want to add our nodes
		while(currDepth < d-1)
		{
			Queue<TreeNode> temp= new LinkedList<TreeNode>();
			while(!queue.isEmpty())
			{
				TreeNode curr= queue.poll();
				if(curr.left!=null) temp.add(curr.left);
				if(curr.right!=null) temp.add(curr.right);
			}
			//Update the depth
			queue=temp;
			currDepth++;
		}
		return queue;
	}
}

package treees;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointers {
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
	
    public Node connect(Node root) {
    	if(root==null)
    		return root;
    	
    	Queue<Node> queue= new LinkedList<Node>();
    	queue.add(root);
    	queue.add(null);
    	
    	while(!queue.isEmpty())
    	{
    		Node current= queue.poll();
    		//If we have reached the end
    		if(current==null && queue.isEmpty())
    			return root;
    		//If we have reached the end of a level
    		else if(current == null)
    		{
    			queue.add(null);
    			continue;
    		}
    		else
    		{
    			current.next= queue.peek();
    			if(current.left!= null)
    				queue.add(current.left);
    			if(current.right!= null)
    				queue.add(current.right);
    		}
    	}
    	return root;
    }
}

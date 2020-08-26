package treeesss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryLevelOrder {
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
    public List<List<Integer>> levelOrder(Node root) 
    {
        List<List<Integer>> res= new ArrayList<List<Integer>>();

    	if(root==null) return res;
    	
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        
        while(!q.isEmpty())
		{
			List<Integer> level= new ArrayList<Integer>();
			int size= q.size();
			
			for(int i=0; i<size; i++)
			{
				Node current= q.poll();
				level.add(current.val);
				q.addAll(current.children);
			}
			res.add(level);
		}
        return res;
    }
}

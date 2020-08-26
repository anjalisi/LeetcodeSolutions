package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
	class Node {
	    public int val;
	    public List<Node> neighbors;
	    
	    public Node() {
	        val = 0;
	        neighbors = new ArrayList<Node>();
	    }
	    
	    public Node(int _val) {
	        val = _val;
	        neighbors = new ArrayList<Node>();
	    }
	    
	    public Node(int _val, ArrayList<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
	
	public Node cloneGraph(Node node) {
		if(node==null) return node;
		//Map stores the key and the neighbors
		HashMap<Integer, Node> map= new HashMap<Integer, Node>();
		
		return cloning(map,node);
    }

	private Node cloning(HashMap<Integer, Node> map, Node node) 
	{
		//Do not continue if we have already visited the node before
		if(map.containsKey(node.val)) return map.get(node.val);
		//Create a copy of the node
		//Node copy= node is not allowed because you are referencing
		Node copy= new Node(node.val);
		map.put(node.val,copy);
		//Add all the neighbors of node and recurse on the neighbors
		for(Node n: node.neighbors)
			 copy.neighbors.add(cloning(map, n));
		return copy;
	} 
}

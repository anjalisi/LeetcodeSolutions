package com.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorder {
    public List<Integer> postorder(Node root) {
        //We will use a stack to implement postorder
    	Stack<Node> stack= new Stack<Node>();
    	LinkedList<Integer> result= new LinkedList();
    	
    	if(root== null)
    		return result;
    	stack.push(root);
    	
    	while(!stack.isEmpty())
    	{
    		Node curr = stack.pop();
    		//Add this node at the first position
    		result.addFirst(curr.val);
    		
    		//Now we will loop through all the children of the current node
    		for(Node node: curr.children)
    		{
    			stack.add(node);
    		}
    	}	
    	return result;
    }
}

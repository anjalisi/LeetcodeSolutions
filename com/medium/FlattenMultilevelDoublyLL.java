package com.medium;

import java.util.Stack;

public class FlattenMultilevelDoublyLL 
{
	class Node {
	    public int val;
	    public Node prev;
	    public Node next;
	    public Node child;
	};
	
    public Node flatten(Node head)
    {
    	Node curr= head;
    	Node tail=head;
    	
    	Stack<Node> st= new Stack<Node>();
    	
    	while(curr!=null)
    	{
    		//If the child exists, we need to traverse the path having the child
    		//and store the rest in the stack (curr.next)
    		if(curr.child!= null)
    		{
    			Node child= curr.child;
    			//Check if this is not the last node
    			if(curr.next!= null)
    			{
    				st.push(curr.next);
    				curr.next.prev=null;
    			}
    			//Setting the links for the traversal
    			curr.next=child;
    			child.prev=curr;
    			curr.child=null;	//unsetting the child
    		}
    		//If we don't have a child node, we will traverse normally
    		tail=curr;
    		curr=curr.next;
    	}
    	//Adding the paths in the stack
    	while(!st.isEmpty())
    	{
    		curr=st.pop();
    		tail.next=curr;
    		curr.prev=tail;
    		//traversing this list
    		while(curr!= null)
    		{
    			tail=curr;
        		curr=curr.next;
    		}
    	}
    	return head;
    }
}

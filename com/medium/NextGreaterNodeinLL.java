package com.medium;

import java.util.ArrayList;
import java.util.Stack;

import com.easy.ListNode;

public class NextGreaterNodeinLL {
    public int[] nextLargerNodes(ListNode head) 
    {
        //We need to convert our LinkedList to a ArrayList
    	ArrayList<Integer> nodesList= new ArrayList<Integer>();
    	//Traverse the LinkedList and put the values in the arraylist
    	ListNode curr= head;
    	while(curr != null)
    	{
    		nodesList.add(curr.val);
    		curr= curr.next;
    	}
    	int res[]= new int[nodesList.size()];
    	//Make a Stack to do the rest of the operations
    	Stack<Integer> stack= new Stack<Integer>();
    	//We will store the indexes in the stack
    	for(int i=0; i<nodesList.size(); i++)
    	{
    		while(!stack.isEmpty() && nodesList.get(stack.peek())< nodesList.get(i))
    		{
    			res[stack.pop()]= nodesList.get(i);
    		}
    		stack.push(i);
    	}
    	return res;		
    }
}

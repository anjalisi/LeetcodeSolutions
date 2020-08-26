package com.challenge;

import com.easy.ListNode;

public class RemeoveElementsLL {
    public ListNode removeElements(ListNode head, int val) 
    {
    	//prev will store the value before the temp node
    	//It makes it easier to connect
    	ListNode temp= head, prev=null;
    	//checking if the head has the value
    	while(temp != null && temp.val==val)
    	{
    		//removing the node and updating temp to new head.
    		head=temp.next;
    		temp= head;
    	}
    	//deleting other occurences
    	
    	while(temp != null)
    	{
    		//Iterate unless the value is not found
    		while(temp != null && temp.val != val)
    		{
    			prev=temp;	//storing the current node
    			temp= temp.next;	//shifting to the next node
    		}
    		//if value is not present in the list
    		if(temp == null) return null;
    		
    		//If we find the node
    		prev.next= temp.next;
    		temp=prev.next;	//updating temp for next iteration
    	}
    	return head;
    	
    }
}

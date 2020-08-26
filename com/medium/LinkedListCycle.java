package com.medium;

import com.easy.ListNode;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) 
    {
    	//First we need to check if we can make a cycle or not
    	ListNode slow= head;
    	ListNode fast= head;
    	
    	while(fast !=null && fast.next !=null)
    	{
    		slow=slow.next;
    		fast= fast.next.next;
    		if(slow==fast)
    			break;
    	}
    	//If no link exists
    	if(slow!=fast)
    		return null;
    	
    	//Detecting where the cycle is
    	slow= head;
    	while(slow!= fast)
    	{
    		slow= slow.next;
    		fast= fast.next;
    	}
    	return slow;
    }
}

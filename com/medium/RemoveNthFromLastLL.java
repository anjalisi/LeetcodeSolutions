package com.medium;

import com.easy.ListNode;

public class RemoveNthFromLastLL {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
    	ListNode dummy= new ListNode(0);
    	dummy.next= head;
    	
    	ListNode slow= dummy;
    	ListNode fast= dummy;
    	
    	for(int i=1; i<=n+1; i++)
    		fast= fast.next;
    	
    	while(fast!=null)
    	{
    		slow= slow.next;
    		fast=fast.next;
    	}
    	
    	slow.next= slow.next.next;
    	return dummy.next;
    }
}

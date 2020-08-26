package com.medium;

import com.easy.ListNode;

public class RemoveDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null || head.next==null)
    		return head;
    	if(head.val!= head.next.val)
    	{
    		head.next=deleteDuplicates(head.next);
    		return head;
    	}
    	//If there are duplicacy in head
    	ListNode curr= head;
    	while(curr.val==head.val && curr !=null)
    	{
    		curr=curr.next;
    	}
    	
    	return deleteDuplicates(curr);
    }
}

package com.easy;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) 
    {
    	ListNode root= head;
    	while(root!=null && root.next!=null)
    	{
    		ListNode temp= root.next;
    		if(root.next.val==root.val)
    			root.next=root.next.next;
    		else
    			root= root.next;
    	}
    	return head;
    }
}

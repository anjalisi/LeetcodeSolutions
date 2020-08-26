package com.medium;

import com.easy.ListNode;

public class ReorderLinkedList {
	
	/*MAIN IDEA: 
	 * 
	 * 1. Take the linked list and traverse to reach the middle.
	 * 2. Then split the list into 2 halves. (1->2-> null , 3->4->null)
	 * 3. After that, reverse the second half. (4->3->null)
	 * 4. Merge the lists taking one element each to get the final result
	 * 
	 * */
    public void reorderList(ListNode head) {
    	if(head==null || head.next==null)
    		return;
    	
        //Head of the first half
    	ListNode l1= head;
    	//Head of the second half
    	ListNode slow= head;
    	//Tail of the first half
    	ListNode prev= null;
    	//Tail of the second half
    	ListNode fast= head;
    	
    	//Now traverse the list to reach the middle
    	while(fast != null && fast.next!= null)
    	{
    		prev=slow;
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	//Splitting the lists
    	prev.next=null;
    	
    	//Reverse the second half
    	ListNode l2= reverse(slow);
    	//Merge
    	merge(l1,l2);
    }

	private void merge(ListNode l1, ListNode l2) 
	{
		while(l1 !=null)
		{
			ListNode l1next= l1.next;
			ListNode l2next= l2.next;
			
			l1.next=l2;
			if(l1next==null)
				break;
			l2.next=l1next;
				
			l1=l1next;
			l2=l2next;
		}
	}

	private ListNode reverse(ListNode head) 
	{
		ListNode curr=head;
		ListNode prev=null;
		
		while(curr != null)
		{
			ListNode next= curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
}

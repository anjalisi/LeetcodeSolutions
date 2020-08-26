package com.medium;

import com.easy.ListNode;

public class SortLinkedList {
    public ListNode sortList(ListNode head) {
    	/*	MAIN IDEA
    	 * 1. Split the list into 2 halves, using slow and fast pointer.
    	 * 2. Split recursively the left and right side
    	 * 3. Merge both the sides and return 
    	 * */
    	
    	if(head==null || head.next==null) return head;
    	ListNode prev= null;
    	ListNode slow= head;
    	ListNode fast= head;
    	
    	while(fast!= null && fast.next !=null)
    	{
    		prev=slow;
    		slow= slow.next;
    		fast=fast.next.next;
    	}
    	//Making 2 different list
    	prev.next=null;
    	ListNode leftSide= sortList(head);
    	ListNode rightSide= sortList(slow);
    	
    	return merge(leftSide, rightSide);
    }

	private ListNode merge(ListNode l, ListNode m)
	{
		ListNode node= new ListNode(0);
		ListNode temp= node;
		
		//Merging both the lists
		while(l!= null && m!= null)
		{
			if(l.val < m.val)
			{
				temp.next= l;
				l=l.next;
			}
			else
			{
				temp.next= m;
				m=m.next;
			}
			//Updating the temp for next iteration
			temp= temp.next;
		}
		if(l!=null)
		{
			temp.next= l;
			l=l.next;
		}
		if(m!=null)
		{
			temp.next= m;
			m=m.next;
		}
		return node.next;
	}
}

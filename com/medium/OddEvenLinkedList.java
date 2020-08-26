package com.medium;

import com.easy.ListNode;

public class OddEvenLinkedList {
	
	/*MAIN IDEA:
	 * 
	 * 1. Make separate Lists for even and odd indices
	 * 2. Add the start of the even list to the end of the odd list.
	 * 
	 * */
    public ListNode oddEvenList(ListNode head) 
    {
    	if(head==null)
    		return head;
    	ListNode oddList= head;
    	ListNode evenList= head.next;
    	ListNode evenHead= evenList;
    	//Creating both the lists
    	while(evenList != null && evenList.next != null)
    	{
    		//Connecting the odd indices
    		oddList.next=evenList.next;
    		//Updating the head
    		oddList= oddList.next;
    		//Building the even list
    		evenList.next= oddList.next;
    		//Updating the head
    		evenList= evenList.next;
    	}
    	//merging the end of the odd to start of even list
    	oddList.next=evenHead;
    	return head;
    }
}

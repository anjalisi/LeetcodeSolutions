package com.medium;

import com.easy.ListNode;

public class ReverseLinkedListBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	/*MAIN IDEA
    	 * 1. Make 2 pointers and start them from position m
    	 * 2. Store the previous value
    	 * 3. Reverse nodes iteratively while you reach n
    	 * 4. Make the connections
    	 * */
    	ListNode prev=null;
    	ListNode curr= head;
    	//Getting both at the same start
    	while(m>1)
    	{
    		prev=curr;
    		curr=curr.next;
    		m--;
    		n--;
    	}
    	ListNode prevCon= prev;
    	ListNode currCon= curr;
    	while(n>0)
    	{
    		//Reverse the list
    		ListNode nextNode= curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=nextNode;
    		n--;
    	}
    	
    	//Updating the lists
    	if(prevCon!=null)
    		prevCon.next=prev;
    	else
    		head=prev;
    	currCon.next=curr;
    	return head;
    }
}

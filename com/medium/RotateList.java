package com.medium;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) 
    {
    	if(head==null)
    		return head;
    	
    	//Counting the length of the Linked List
    	int len=1; 
    	ListNode temp= head;
    	while(temp.next != null)
    	{
    		temp= temp.next;
    		len++;
    	}
    	
    	//Checking if k>len
    	if(k>len)
    		k %= len;
    	
    	//Updating k. This would make it an easy left rotation problem
    	k=len-k;
    	
    	//
    	if(k==0 || k==len)	//no rotation is required
    		return head;
    	
    	//Getting the pointer at k
    	ListNode curr= head;
    	int count=1;	//tracks our current position
    	
    	while(count <k && curr.next != null)
    	{
    		curr= curr.next;
    		count++;
    	}
    	
    	if(curr==null)
    		return head;
    	
    	ListNode kthnode= curr;
    	temp.next= head;		//temp was at the last node
    	head= kthnode.next;
    	kthnode.next= null;
    	return head;
    }
}

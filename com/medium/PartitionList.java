package com.medium;

import com.easy.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) 
    {
    	/*MAIN IDEA
    	 * 1. Create 2 separate lists, one with value less than target, another with value more than target.
    	 * 2. Merge the two
    	 * 3. Return the head of list with smaller values
    	 * 
    	 * */
        	//Creating nodes for smaller value list
        	ListNode smStart= null;
        	ListNode smEnd= null;
        	//Creating nodes for larger value list
        	ListNode lgStart= null;
        	ListNode lgEnd= null;
        	
        	while(head!=null)
        	{
        		ListNode next= head.next;
        		head.next=null;
        		
        		if(head.val <x)
        		{
        			//Start of iteration
        			if(smStart==null)
        			{
        				smStart=head;
        				smEnd= head;
        			}
        			else
        			{
        				smEnd.next=head;
        				//Updating smEnd
        				smEnd=head;
        			}
        		}
        		else
        		{
        			//Start of iteration
        			if(lgStart==null)
        			{
        				lgStart=head;
        				lgEnd= head;
        			}
        			else
        			{
        				lgEnd.next=head;
        				//Updating smEnd
        				lgEnd=head;
        			}
        		}
        		//Moving to the next node
        		head=next;
        	}
        	if(smStart==null) return lgStart;
        	//Adding the lists
        	smEnd.next=lgStart;
        	return smStart;
        }
    
}

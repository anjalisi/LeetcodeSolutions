package com.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//class ListNode {
//	  int val;
//	      ListNode next;
//	      ListNode() {}
//	      ListNode(int val) { this.val = val; }
//	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
public class BinaryList {
    public int getDecimalValue(ListNode head) 
    {
    	StringBuilder str= new StringBuilder();
    	while(head != null)
    	{
    		int val= head.val;
    		str.append(val);
    		head= head.next;
    	}
    	return Integer.parseInt(str.toString(), 2);
    }
	
}

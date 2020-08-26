package com.easy;

public class MergeTwoLL {
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
	 {
		 
		 /*
		  * if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        if(l1.val < l2.val)
        {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else
        {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
		  * */
		 ListNode temp= new ListNode(0);
		 ListNode curr=temp;
		 
		 while(l1!=null && l2!= null)
		 {
			 if(l1.val <l2.val)
			 {
				 curr.next=l1;
				 l1=l1.next;
			 }
			 else
			 {
				 curr.next=l2;
				 l2=l2.next;
			 }
		 }
		 if(l1!=null)
		 {
			 curr.next=l1;
			 l1=l1.next;
		 }
		 if(l2!=null)
		 {
			 curr.next=l2;
			 l2=l2.next;
		 }
		 
		 return temp.next;
	 }
}

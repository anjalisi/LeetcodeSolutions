package com.easy;

import java.util.Stack;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
    	Stack<Integer> stack1= new Stack<Integer>();
    	Stack<Integer> stack2= new Stack<Integer>();
    	//Add the values of the nodes in the stack
    	while(l1 != null)
    	{
    		stack1.push(l1.val);
    		l1= l1.next;
    	}
    	while(l2 != null)
    	{
    		stack2.push(l2.val);
    		l2= l2.next;
    	}
    	
    	int sum=0;
    	
    	ListNode res= new ListNode(0);
    	while(!stack1.isEmpty() || !stack2.isEmpty())
    	{
    		if(!stack1.isEmpty())
    			sum += stack1.pop();
    		if(!stack2.isEmpty())
    			sum += stack2.pop();
    		res.val= sum%10;
    		//We make a new node which will store the carry of the sum
    		ListNode before= new ListNode(sum/10);
    		before.next= res;
    		//Updating the pointer for next iteration
    		res=before;
    		sum /= 10;	//sum=1 if carry is there, 0 if not there
    	}
    	return res.val==0 ? res.next:res;
    }
}

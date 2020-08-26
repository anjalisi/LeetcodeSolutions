package com.medium;

import com.easy.ListNode;

public class ConvertLinkedListToBST {
    public TreeNode sortedListToBST(ListNode head) 
    {
    	/*MAIN IDEA
    	 * 1. The root is at the middle of the list (use fast and slow pointers)
    	 * 2. The left half is left subtree, right half is right subtree
    	 * 3. Make the end of the left half null, so now it is a new list, which can be recursed further
    	 * for making the whole tree
    	 * 4. Recurse on the right too 
    	 * 5. Return the root
    	 * */
    	if(head==null) return null;
    	if(head.next==null) return new TreeNode(head.val);
    	
    	ListNode slow=head;
    	ListNode prev= null;
    	ListNode fast= head;
    	//Traverse to get in the middle
    	while(fast!= null && fast.next!=null)
    	{
    		prev= slow;
    		slow= slow.next;
    		fast= fast.next.next;
    	}
    	//Make the root
    	TreeNode root= new TreeNode(slow.val);
    		
    	//Update the left half if we still have a left subtree
    	if(prev != null)
    	{
    		prev.next=null;	//Makes a new list with head as first node
    		root.left= sortedListToBST(head);
    	}
    	//First list: [head, prev], 2nd list[slow.next, end]
    	root.right= sortedListToBST(slow.next);
    	return root;
    }
}

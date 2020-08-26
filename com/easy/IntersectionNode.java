package com.easy;

import java.util.HashSet;

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode n1, ListNode n2) 
    {
    	HashSet<ListNode> hs = new HashSet<ListNode>(); 
        while (n1 != null) { 
            hs.add(n1); 
            n1 = n1.next; 
        } 
        while (n2 != null) { 
            if (hs.contains(n2)) { 
                return n2; 
            } 
            n2 = n2.next; 
        } 
        return null; 
    }
}

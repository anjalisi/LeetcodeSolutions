package com.medium;

import java.util.ArrayList;
import java.util.List;

public class AllElementsIn2BST {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        /*
        MAIN IDEA
        1. Traverse both the trees and make a list containing the inorder traversal
        2. We choose the inorder traversal because it is gives us a sorted order. And applying Binary search in sorted arrays is much easier
        3. Compare the values from both the trees and add the smaller one first into the final result
        */
        //Getting inorder for 1st tree
        List<Integer> l1 = new ArrayList<>();
        inorder(root1, l1);
        //Getting inorder for 2nd tree
        List<Integer> l2 = new ArrayList<>();
        inorder(root2, l2);

        return mergeLists(l1,l2);
    }

    private List<Integer> mergeLists(List<Integer> l1, List<Integer> l2) {
        List<Integer> res = new ArrayList<>();
        int i=0, j=0;
        while(i < l1.size() && j<l2.size()){
            if(l1.get(i) > l2.get(j)) res.add(l2.get(j++));
            else res.add(l1.get(i++));
        }
        //If any elements are left
        while(i < l1.size())
            res.add(l1.get(i++));
        while(j<l2.size())
            res.add(l2.get(j++));
        
        return res;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        //base condition
        if(root==null) return;
        //Traverse to left
        inorder(root.left, list);
        //Add to list
        list.add(root.val);
        //Traverse to right
        inorder(root.right, list);
    }
}

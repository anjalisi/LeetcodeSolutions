package com.medium;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return symmetricTest(root, root);   
    }
    public boolean symmetricTest(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;

        return (t1.val==t2.val) && symmetricTest(t1.left, t2.right)&& symmetricTest(t1.right, t2.left);
    }
}
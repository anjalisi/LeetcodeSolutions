package com.medium;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) 
    {
        return validate(root, null, null);    
    }

    private boolean validate(TreeNode root, Integer min, Integer max) {
        if(root==null) return true;
        //Checking the constraints
        else if(min!=null && root.val<= min || max!= null && root.val >= max)
            return false;
        else
            return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
}
package com.medium;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null) return result;
        findAllPaths(result, new ArrayList<Integer>(), sum, root);
        
        return result;
    }
    public void findAllPaths(List<List<Integer>> result,  ArrayList<Integer> current, int sum,TreeNode root){
        if(root==null) return;
        current.add(root.val);
        //Checking if we have reached the sum, and it is at the leaf node
        if(sum==root.val && root.left==null && root.right==null){
            result.add(current);
            return;
        }
        //Now recurse on left and right
        findAllPaths(result, new ArrayList<Integer>(current), sum-root.val, root.left);
        findAllPaths(result, new ArrayList<Integer>(current), sum-root.val, root.right);
    }
}

package treeesss;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0 || nums==null) return null;
        return constructTree(nums, 0, nums.length-1);
    }

    private TreeNode constructTree(int[] nums, int start, int end) 
    {
        //Breaking condition
        if(start>end) return null;
        //Root is at the    middle
        int mid= start+(end-start)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left= constructTree(nums, start, mid-1);
        root.right= constructTree(nums, mid+1, end);

        return root;
    }
}
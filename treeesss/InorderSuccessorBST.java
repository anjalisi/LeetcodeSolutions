package treeesss;

public class InorderSuccessorBST {
    public TreeNode findSuccessor(TreeNode root, TreeNode p){
        if(p.right != null)
            return findMin(p.right);
        
        TreeNode successor= null;
        while(root!=null){
            if(root.val> p.val){
                successor= root;
                root= root.left;
            }
            else if(root.val < p.val)
                root= root.right;
            else break;
        }
        return successor;
    }

    private TreeNode findMin(TreeNode right) {
        while(right.left!=null)
            right= right.left;
        return right;
    }
    
}

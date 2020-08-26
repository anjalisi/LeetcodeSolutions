package treeesss;

public class FoldableBinaryTree {
	boolean isFoldable(Node n, Node m)
	{
		if(n == null && m== null)
			return true;
		if(n== null || m==null)
			return false;
		return n.key==m.key && isFoldable(n.left, m.left) && isFoldable(n.right, m.right);
	}
}

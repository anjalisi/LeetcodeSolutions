package treeesss;

public class RemovePathLessThanK {

	Node remove(Node node, int k)
	{
		return removeAll(node, 1, k);
	}

	private Node removeAll(Node node, int level, int k) {
		// TODO Auto-generated method stub
		node.left= removeAll(node.left, level+1, k);
		node.right= removeAll(node.right, level+1, k);
		
		if(node.left == null && node.right==null && level<=k)
			return null;
		return node;
	}
}

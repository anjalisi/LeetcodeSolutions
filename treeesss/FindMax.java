package treeesss;

public class FindMax {
	int maxBST(Node node)
	{
		if(node== null)
			return -1;
		int result= Integer.MIN_VALUE;
		int left= maxBST(node.left);
		int right= maxBST(node.right);
		
		if(left > result)
			result= left;
		else
			result= right;
		return result;
	}
	int minBST(Node node)
	{
		if(node== null)
			return -1;
		int result= Integer.MIN_VALUE;
		int left= minBST(node.left);
		int right= minBST(node.right);
		
		if(left < result)
			result= left;
		else
			result= right;
		return result;
	}
}

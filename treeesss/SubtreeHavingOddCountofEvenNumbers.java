package treeesss;
//Given a binary tree, find the number of subtrees having odd count of even numbers.
public class SubtreeHavingOddCountofEvenNumbers 
{
	// Returns count of subtrees having odd count of  
	// even numbers 
	static class P 
	{ 
	    int count = 0; 
	} 
	static int countSubtrees(Node root)
	{
		P p = new P();
		countRec(root, p);
		return p.count;
	}
	static int countRec(Node root, P p)
	{
		if(root== null)
			return 0;
		
		int c=countRec(root.left, p);
		c+=countRec(root.right, p);
		
		//Check if root is even
		if(root.key %2==0)
			c++;
		
		if(c%2 != 0)
			p.count++;
		
		return c;
	}
}

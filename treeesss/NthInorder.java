package treeesss;

public class NthInorder 
{
	static int nthOrder(Node temp, int n)
	{
		int count=0;
		while(count <= n)
		{
			nthOrder(temp.left, n);
			count++;
			
			if(count==n)
				return temp.key;
			
			nthOrder(temp.right, n);
		}
		return -1;
	}
}

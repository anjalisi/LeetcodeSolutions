package treeesss;

import java.util.LinkedList;
import java.util.Queue;
//Inserting into first position found
public class InsertionInBST {
	static Node root;
	static Node temp=root;
	static void insert(Node temp, int key)
	{
		Queue<Node> q= new LinkedList<Node>();
		q.add(temp);
		while(!q.isEmpty())
		{
			temp= q.poll();
			
			if(temp.left == null)
			{
				temp.left= new Node(key);
				break;
			}
			else if(temp.right ==null)
			{
				temp.right= new Node(key);
				break;
			}
			else
				q.add(temp.right);
		}
	}
}

package treeesss;

public class Top3Elements 
{
	static int first=0, second=0, third=0;
	static void threeLargest(Node node)
	{
		if(node==null)
			return;
		if(node.key > first)
		{
			third= second; 
			second= first;
			first= node.key;
		}
		else if(node.key > second && node.key < first)
		{
			third= second;
			second= node.key;
		}
		else if(node.key > third && node.key < first && node.key < second)
		{
			third= node.key;
		}
		//Call preorder
		threeLargest(node.left);
		threeLargest(node.right);
	}
}

package treeesss;

import java.util.Stack;

public class LevelOrderTraversalSpiral {
//Here, we will use two stacks. One for L to R. Other for R to L
	//In every iteration ,  we have nodes of one level in one of the stacks. We print the nodes, 
	//and push nodes of next level in other stack.
	void printSpiral(Node node)
	{
		if(node== null)
			return;
		//R to L
		Stack<Node> stack1= new Stack<Node>();
		//L to R
		Stack<Node> stack2= new Stack<Node>();
		 //Push the first node on first stack
		stack1.push(node);
		
		while(!stack1.isEmpty() || !stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				//Pop the data from this stack and push it onto the second stack
				Node temp=stack1.peek();
				stack1.pop();
				System.out.println(temp.key);
				if(temp.right != null)
					stack2.push(temp.right);

				if(temp.left != null)
					stack2.push(temp.left);
			}
			//Same for stack 2
			while(!stack2.isEmpty())
			{
				//Pop the data from this stack and push it onto the second stack
				Node temp=stack2.peek();
				stack2.pop();
				System.out.println(temp.key);
				if(temp.right != null)
					stack1.push(temp.right);

				if(temp.left != null)
					stack1.push(temp.left);
			}
						
		}
	}
	
	
}

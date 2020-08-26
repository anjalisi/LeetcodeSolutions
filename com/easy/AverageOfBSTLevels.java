package com.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class AverageOfBSTLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res= new ArrayList<Double>();
//        int sum=0, count=0;
//        Queue<TreeNode> q= new LinkedList<TreeNode>();
//        q.add(root);
//        
//        while(!q.isEmpty()) {
//        	sum=0;
//        	count=0;	//Making sum and count 0 for each level
//        	//Making temp queue for storing the child of root
//        	Queue<TreeNode> child= new LinkedList<TreeNode>();
//        	while(!q.isEmpty())
//        	{
//        		TreeNode n= q.poll();
//        		sum+= n.val;
//        		count++;	//count the level 
//        		if(n.left != null)
//        			child.add(n.left);
//        		 
//        		if(n.right != null)
//        			child.add(n.right);
//        	}
//        	q=child;	//Adding the children to the main queue for next iterations
//        	res.add((sum*1.0)/count);
//        }
//        return res;
        List<Double> average = new ArrayList();
        
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for(int i = 0; i < size; i++){
                
                TreeNode tempNode = queue.poll();
                sum += tempNode.val;
                
                if(tempNode.right != null){
                    queue.add(tempNode.right);
                }
                
                if(tempNode.left != null){
                    queue.add(tempNode.left);
                }

            }
            average.add(sum/size);
        }
        
        return average;
    }
}

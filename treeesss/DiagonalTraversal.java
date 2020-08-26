package treeesss;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;

public class DiagonalTraversal {
	static void diagonalPrintUtil(Node root,int d, 
            HashMap<Integer,Vector<Integer>> diagonalPrint){ 
          
         // Base case 
        if (root == null) 
            return; 
          
        // get the list at the particular d value 
        Vector<Integer> k = diagonalPrint.get(d); 
          
        // k is null then create a vector and store the data 
        if (k == null) 
        { 
            k = new Vector<>(); 
            k.add(root.data); 
        } 
          
        // k is not null then update the list 
        else
        { 
            k.add(root.data); 
        } 
          
        // Store all nodes of same line together as a vector 
        diagonalPrint.put(d,k); 
          
        // Increase the vertical distance if left child 
        diagonalPrintUtil(root.left, d + 1, diagonalPrint); 
           
        // Vertical distance remains same for right child 
        diagonalPrintUtil(root.right, d, diagonalPrint); 
    } 
      
    // Print diagonal traversal of given binary tree 
    static void diagonalPrint(Node root) 
    { 
        // create a map of vectors to store Diagonal elements 
        HashMap<Integer,Vector<Integer>> diagonalPrint = new HashMap<>(); 
        diagonalPrintUtil(root, 0, diagonalPrint); 
          
        System.out.println("Diagonal Traversal of Binnary Tree"); 
        for (Entry<Integer, Vector<Integer>> entry : diagonalPrint.entrySet()) 
        { 
            System.out.println(entry.getValue()); 
        } 
    } 
}

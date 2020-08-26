package com.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleI 
{
    public List<List<Integer>> generate(int numRows) 
    {
    	 List<List<Integer>> triangle = new ArrayList<List<Integer>>();

         // First base case; if user requests zero rows, they get zero rows.
         if (numRows == 0) {
             return triangle;
         }
//         
//         // Second base case; first row is always [1].
//         triangle.add(new ArrayList<>());
//         triangle.get(0).add(1);
//
//         for (int rowNum = 1; rowNum < numRows; rowNum++) {
//             List<Integer> row = new ArrayList<>();
//             List<Integer> prevRow = triangle.get(rowNum-1);
//
//             // The first row element is always 1.
//             row.add(1);
//
//             // Each triangle element (other than the first and last of each row)
//             // is equal to the sum of the elements above-and-to-the-left and
//             // above-and-to-the-right.
//             for (int j = 1; j < rowNum; j++) {
//                 row.add(prevRow.get(j-1) + prevRow.get(j));
//             }
//
//             // The last row element is always 1.
//             row.add(1);
//
//             triangle.add(row);
//         }
         	
         
         //Another method
         //First we will add the first row
         
         List<Integer> firstRow= new ArrayList<Integer>();
         firstRow.add(1);
         triangle.add(firstRow);	//Adding the first row
         
         //In every iteration we will add a new list
         for(int i=1; i<numRows; i++)
         {
        	 //Grab the previous row
        	 List<Integer> prevRow= triangle.get(i-1);
        	 List<Integer> currRow= new ArrayList<Integer>();
        	 currRow.add(1);
        	 
        	 //Now we will iterate through the previous loop to add elements to the curr loop
        	 
        	 for(int j=1; j<i; j++)
        	 {
        		 currRow.add(prevRow.get(j-1)+ prevRow.get(j));
        	 }
        	 currRow.add(1);
        	 triangle.add(currRow);
         }
         
         return triangle;
    }
}

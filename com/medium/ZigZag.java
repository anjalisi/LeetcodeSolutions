package com.medium;

import java.util.Arrays;

public class ZigZag {
	public static String convert(String s, int numRows) 
	{
		if(numRows==1)
			return s;
		int len=s.length();
		char[] str= s.toCharArray();
		String[] arr=new String[numRows];
		Arrays.fill(arr, "");
		int row=0; 
		boolean down=true;
		for(int i=0; i<len; ++i	)
		{
			arr[row]+=(str[i]);
			if(row==numRows-1)
				down=false;
			else if(row==0)
				down=true;
			if(down)
			{
				row++;
			}
			else
				row--;
		}
		 StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < arr.length; i++) {
	         sb.append(arr[i]);
	      }
	      String res = sb.toString();
		return res;
    }
	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS"; 
        int n = 3; 
        System.out.println(convert(str,n));
	}
}

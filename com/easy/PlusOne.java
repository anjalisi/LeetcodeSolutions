package com.easy;

import java.util.ArrayList;

public class PlusOne {
	public int[] plusOne(int[] digits) 
    {
		int len=digits.length;
        digits[len-1]=digits[len-1]+1;      
        int[] r=new int[len+1];               
        for(int i=digits.length-1;i>0;i--)
        { 
            if(digits[i]>9)     
            {
                digits[i]=0;        
                digits[i-1]=digits[i-1]+1;     
            }
            
        }
        if(digits[0]>9)
        {
            r[0]=1;
            return r;
        }
        return digits;
 
    }
	
}

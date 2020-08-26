package com.easy;

public class SwapOnlyCharacters {
    public static String reverseOnlyLetters(String S) 
    {
    	int low=0; 
    	int high=S.length()-1;
    	char[] str= S.toCharArray();
    	while(low <= high)
    	{
    		if(Character.isAlphabetic(str[low]) && Character.isAlphabetic(str[high]))
    		{
    			char temp= str[low];
    			str[low]=str[high];
    			str[high]=temp;
    			
    			low++;
    			high--;
    		}
    		else if(!Character.isAlphabetic(S.charAt(low)))
    			low++;
    		else if(!Character.isAlphabetic(S.charAt(high)))
    			high--;
    	}
    	String res= new String(str);
    	return res;
    }

	public static void main(String[] args) {
		String S= "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(S));
	}
}

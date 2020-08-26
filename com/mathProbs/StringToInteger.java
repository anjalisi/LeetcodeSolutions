package com.mathProbs;

public class StringToInteger 
{
    public static int myAtoi(String str) 
    {
    	String trimmed = str.trim();
        if (trimmed.isEmpty()) return 0;
        
        // Number Builder
        StringBuilder number = new StringBuilder();
        int i = 0;
        while (i < trimmed.length()) {
            // If character invalid return 0
            if (invalidCharacter(trimmed.charAt(i))) return 0;
            
            //Sign
            if (trimmed.charAt(i) == '+' || trimmed.charAt(i) == '-')
            {
                number.append(trimmed.charAt(i++));
                //Check to avoid multiple signs e.g (+-)
                if (i == trimmed.length() || !Character.isDigit(trimmed.charAt(i)))
                	return 0;
            }
            
            //Build number
            if (Character.isDigit(trimmed.charAt(i))) 
            {
                while (i < trimmed.length() && Character.isDigit(trimmed.charAt(i)))
                {
                    number.append(trimmed.charAt(i++));
                }
                break;
            }
        }
        
        
        int ans = 0;
        try 
        {
            // If can't parse must be too big or too small
            ans = Integer.parseInt(number.toString());
        } 
        catch (NumberFormatException e) 
        {
            ans = number.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return ans;
    }
    
    private static boolean invalidCharacter(char c) 
    {
        return c != ' ' && c != '+' && c != '-' && !Character.isDigit(c);
    }		

    
    public static void main(String[] args)
    {
    	String str= "++1";
    	System.out.println(myAtoi(str));
	}
}

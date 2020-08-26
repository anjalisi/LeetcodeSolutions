package com.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsFromPhone {
    public List<String> letterCombinations(String digits) 
    {
        List<String> result= new ArrayList<String>();
        if(digits==null || digits.length()==0) return result;
        //Now we will do the mappings in a string array instead of a hashmap (less memory usage)
        String[] mappStrings= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        //We just need a recursive call now
        letterCombinations(result, digits, "",0, mappStrings);
        return result;
    }

    private void letterCombinations(List<String> result, String digits, String current, int index, String[] mappStrings) 
    {
        //Adding the base case
        if(current.length()== digits.length())
        {
            result.add(current);
            return;
        }
        String keys= mappStrings[digits.charAt(index)-'0'];
        for(int i=0; i<keys.length(); i++)
        {
            //Add the current character to the current string and increment the pointer to the next digit
            letterCombinations(result, digits, current+keys.charAt(i), index+1, mappStrings);
        }
    }
}
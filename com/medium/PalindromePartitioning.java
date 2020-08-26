package com.medium;
import java.util.*;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        List<String> curr= new ArrayList<>();
        partitionString(s, result, curr);
        return result;
    }

    private void partitionString(String s, List<List<String>> result, List<String> curr)
    {
        if(s.length()==0)
        {
            result.add(new ArrayList<>(curr));
            
        }
        for(int i= 0; i<s.length(); i++)
        {
            String substr= s.substring(0, i+1);
            if(isPalindrome(substr))
            {
                curr.add(substr);
                //Now backtrack on the rest of the string
                partitionString(s.substring(i+1), result, curr);
                curr.remove(curr.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s){
        for(int i = 0,j = s.length()-1; i<j ;i++,j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
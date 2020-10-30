package com.medium;

public class DecodeWays {
    public int numDecodings(String s) {
        //We make a dp to ocunt all the ways possible uptil that length
        int[] dp= new int[s.length()+1];
        dp[0]=1;    //ways to decode an empty string is 0
        dp[1]= s.charAt(0)=='0' ?0:1;    //if first char is 0, there is no mapping for zero
        for(int i=2; i<dp.length; i++){
            int oneDigit= Integer.valueOf(s.substring(i-1, i));
            int twoDig= Integer.valueOf(s.substring(i-2, i));
            //All the ways if we take only the current character
            if(oneDigit>=1)
                dp[i]+= dp[i-1];
            //If we take prev 2 digits
            if(twoDig>=10 && twoDig<=26)
                dp[i]+=dp[i-2];
        }
        return dp[s.length()];
    }
}

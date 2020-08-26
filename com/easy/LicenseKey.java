package com.easy;

public class LicenseKey {
    public String licenseKeyFormatting(String S, int K) 
    {
    	/*MAIN IDEA
    	 * 1. Remove all the '-' from the string.
    	 * 2. Add the '-' after the K steps
    	 * */
    	S= S.replaceAll("-","");
    	S=S.toUpperCase();
    	//We won't cover the first index, because we dont want to insert a '-' there
    	StringBuilder str= new StringBuilder(S);
    	for(int i=S.length()-K; i>0; i=i-K)
    	{
    		str.insert(i, "-");
    	}
    	return str.toString();
    }
}

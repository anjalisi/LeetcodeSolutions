package com.easy;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(needle.length()> haystack.length()) return -1;

        int h= haystack.length();
        int n= needle.length();

        for(int i=0; i<=h-n ; i++){
            int j;
            for(j=0; j<n ; j++){
                if(haystack.charAt(i+j)!= needle.charAt(j))
                    break;
            }
            if(j==n)
                return i;
        }
        return -1;
    }
}
package com.easy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) 
    {
    	Arrays.sort(g);
        Arrays.sort(s);
        int answer = 0;
        int cookie = s.length - 1;
        int child = g.length - 1;
        while(cookie >= 0 && child >=0){
            if(g[child] <= s[cookie]){
                answer++;
                cookie--;
            } 
            child--;
        }
        return answer;
    }
}

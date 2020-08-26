package com.easy;

public class ReverseInteger{
    public int reverse(int x) {
        long reversed=0;
        boolean neg= x<0? true: false;
        if(neg){
            x*=-1;
        }
        while(x>0){
            reversed = (reversed*10) + x%10;
            x/=10;
        }
        if(reversed >Integer.MAX_VALUE) return 0;
        return neg? (int)(-1* reversed): (int)reversed;

    }
}
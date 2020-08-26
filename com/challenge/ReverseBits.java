package com.challenge;

public class ReverseBits {
    public int reverseBits(int n) {
        String s= Integer.toBinaryString(n);
        StringBuilder str= new StringBuilder(s);
        str= str.reverse();
        return Integer.valueOf(str.toString());
    }
}
package com.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        int A= Integer.parseInt(a, 2);
        int B= Integer.parseInt(b, 2);
        
        return Integer.toBinaryString(A+B);
    }
}

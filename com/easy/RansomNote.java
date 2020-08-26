package com.easy;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;//Corner case
        
        char [] ch = ransomNote.toCharArray();
        int[] pos = new int[26];//for one char of ransom, traverse magazine and traverse beginning postion  for a,b,c,d,....z ,
        for(char cr: ch){
            int idx = magazine.indexOf(cr,pos[cr - 'a']);
            if(idx ==-1){
                return false;
            }else{
                pos[cr - 97] = idx+1 ;//next time, if we meet cr,we should find it in magazine and start from idx+1,  store the result in pos[] , that means renew the traverse position, then we can avoid repeatation      
            }           
        }        
        return true; 
    }
}

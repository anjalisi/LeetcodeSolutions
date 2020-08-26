package com.easy;

public class CityUpper {
    public static boolean detectCapitalUse(String word) 
    {
    	int capticalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capticalCount++;
            }
        }
        
        return capticalCount == 0 
            || capticalCount == word.length() 
            || (capticalCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
    
    public static void main(String[] args) {
		String word="FlaG";
		System.out.println(detectCapitalUse(word));
	}
}

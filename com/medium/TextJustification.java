package com.medium;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        /*
        METHOD:
        1. We need to check where the words length exceeds the maxWidth. When that happens, we need to add it to the result.
        2. During adding spaces, there are 2 allignments to consider:
            a. Left justify: (use in last line, or the lines where there is only one word) In this, the spaces will be at the end of the list
            b. Middle justify: in this, the spaces will be equally distributed in between the words. If there are any extra spaces, 
            those will be added from left to right.
            Eg: if there are 3 words and 5 spaces
            word1_ _ _word2_ _word3
        */
        List<String> result= new ArrayList<>();  
        //We need to traverse the list to see upto where the words can be added
        int i=0; 
        while(i<words.length){
            int j= i+1;
            //Initially the linelength just has the length of the word at position i
            int linelength= words[i].length();
            //Here, j+i-1 is the minimum spaces required between the words
            while(j<words.length && (linelength+words[j].length()+(j-i-1)<maxWidth)){
                linelength+= words[j].length();
                j++;
            }
            
            int diff= maxWidth-linelength;
            int numberOfWords=j-i;
            //Checking for the left justify case
            if(numberOfWords==1 || j >= words.length) result.add(leftJustify(words, diff,i,j));
            else result.add(middleJustify(words, diff,i,j));    

            i=j;
        }
        return result;
    }

    private String middleJustify(String[] words, int diff, int i, int j) {
        //Groups of spaces we need (equal to number of words-1)
        int groupSpaces= j-i-1;
        //Spaces minimum after every word
        int space= diff/groupSpaces;
        //The extra spaces left which would be added from the left to right
        int extraSpace= diff%groupSpaces;
        
        StringBuilder str= new StringBuilder(words[i]);
        for(int k=i+1; k<j; k++){
            //The spaces required after every word 
            int spacesApply= space+(extraSpace-- >0 ? 1:0);
            str.append(" ".repeat(spacesApply)+words[k]);
        }
        return str.toString();
    }

    private String leftJustify(String[] words, int diff, int i, int j) {
        //number of spaces which are going to be at the end
        int rightSpaces= diff-(j-i-1);
        //Initially add the string at position i
        StringBuilder str= new StringBuilder(words[i]);
        for(int k=i+1; k<j; k++){
            //Adding 1 space after the word
            str.append(" "+words[k]);
        }
        //Add the extra spaces in the end
        str.append(" ".repeat(rightSpaces));
        return str.toString();
    }
}

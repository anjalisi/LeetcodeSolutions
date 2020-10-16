package com.medium;

public class Trie {
    //Implementing using arrays
    private Trie children[];
    private boolean isEndOfWord; 
    /** Initialize your data structure here. */
    public Trie() {
        children= new Trie[26];
        isEndOfWord= false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        //We have to check if the word already exists or not
        //We also have to check if we have to add any character after a certain prefix
        Trie curr= this;
        //Traverse through each character
        for(char ch: word.toCharArray()){
            //Checking if the character already exists
            if(curr.children[ch-'a']== null)
                curr.children[ch-'a'] = new Trie();
            //Move forward into the trie
            curr= curr.children[ch-'a'];
        }
        //Make the end of the word true
        curr.isEndOfWord= true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        //Same as insert, but if a character is not present, return false
        Trie curr= this;
        for(char ch: word.toCharArray()){
            if(curr.children[ch-'a'] == null)
                return false;
            curr= curr.children[ch-'a'];
        }
        //Checking if this is the end of the word
        return curr.isEndOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie curr= this;
        for(char ch: prefix.toCharArray()){
            if(curr.children[ch-'a'] == null)
                return false;
            curr= curr.children[ch-'a'];
        }
        return true;
    }    
}

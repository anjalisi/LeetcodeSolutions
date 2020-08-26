package com.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
//import com.easy.Str;

public class NumberOfMatchingSubsequence {
    public int numMatchingSubseq(String S, String[] words) {
    	int res=0;
        Map<Character, Queue<String>> map= new HashMap<Character, Queue<String>>();
        for(char ch: S.toCharArray())
        {
        	if(!map.containsKey(ch))
        		map.put(ch, new LinkedList<String>());
        }
        for(String word:words)
        {
        	if(word.length()>S.length())
        		continue;	//because we dont want it to add
        	if(map.containsKey(word.charAt(0)))
        		map.get(word.charAt(0)).add(word); //if first letter matches, add it to the queue
      
        }
        for(char ch: S.toCharArray())
        {
        	Queue<String> queue= map.get(ch);
        	int size= queue.size();
        	for (int i = 0; i < size; i++) {
                String curWord = queue.remove();

                if (curWord.length() == 1) {
                    ++res;
                }
                else if (map.containsKey(curWord.charAt(1))) {
                    map.get(curWord.charAt(1)).add(curWord.substring(1));
                }
            }
        }
        return res;
    }
}

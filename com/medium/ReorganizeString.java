import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();      
        //Stores the character with acc to their frequency
        PriorityQueue<Character> heap = new PriorityQueue<>((a,b)->
        map.get(b) - map.get(a));
        //Result
        StringBuilder result = new StringBuilder();

        for(int i =0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        //Fill up the heap
        heap.addAll(map.keySet());

        while(heap.size() > 1){
            //Max frequent character
            char curr = heap.remove();
            //2nd max frequent character
            char next = heap.remove();
            //Add the chars to the result
            result.append(curr);
            result.append(next);
            //Add the character back to the heap & update its count
            //in the hashmap
            map.put(curr, map.get(curr)-1);
            map.put(next, map.get(next)-1);

            if(map.get(curr) > 0)
                heap.add(curr);
            if(map.get(next) > 0)
                heap.add(next);
        }
        //if frequency of the last char>1, it means we were not able to generate the string
        if(!heap.isEmpty()){
            char last = heap.remove();
            if(map.get(last) >1)
                return "";
            result.append(last);
        }
        return result.toString();
    }
}
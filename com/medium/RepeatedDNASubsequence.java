package com.medium;

public class RepeatedDNASubsequence {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res= new ArrayList<>();
        if(s==null || s.length()==0)
            return res;
        HashMap<String, Integer> map= new HashMap<>();
        int i=0;
        while(i+10 <= s.length()){
            String subs= s.substring(i, i+10);
            i++;
            map.put(subs, map.getOrDefault(subs,0)+1);
            if(map.get(subs)==2)
                res.add(subs);
        }
        return res;
    }  
}

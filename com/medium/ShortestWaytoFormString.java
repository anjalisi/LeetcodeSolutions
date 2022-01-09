public class ShortestWaytoFormString {
    public int shortestMethod(String source, String target){
        int res = 0;
        String remaining = target; 
        while(remaining.length() > 0){
            StringBuilder subsequence = new StringBuilder();
            int i = 0;
            int j = 0;
            while(i< source.length() && j<remaining.length()){
                if(source.charAt(i++) == remaining.charAt(j))
                    subsequence.append(remaining.charAt(j++));
            }
            if(subsequence.length()==0)
                return -1;
            remaining = remaining.substring(subsequence.length());
            res ++;
        }
        return res;
    }
}

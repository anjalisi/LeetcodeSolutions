public class Test{
    public static void name() {
		Scanner sc= new Scanner(System.in);
        int 
    }
    public static int government(int size, int vote, int[] votes)
    {
        if(vote > size)
            return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<votes.length; i++){
            map.put(votes[i],map.getOrDefault(votes[i], 0)+1);
        }
        for (Map.Entry m : map.entrySet())
        {
            Integer temp = (Integer)m.getValue();
            if(temp > vote)
                count++;
        }
        return count;
    }
}
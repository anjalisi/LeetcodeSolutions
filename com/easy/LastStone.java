public class LastStone {
    public int lastStoneWeight(int[] stones) {
        /*
        METHOD
        1. Create a maxheap (stores in descending order)
        2. Take top 2 values, and subtract them
            - if these are same, don't insert anything
            - else, add the difference back to the heap
        3. In the end check if maxheap is empty or not
        */
        
        //Java creates minHeap by default
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for(int item : stones)
            maxHeap.add(-item);     //adding a '-' converts the minheap to maxheap
        
        while(maxHeap.size() > 1){
            int first = -maxHeap.remove();  //adding '-' to get the original value
            int second = -maxHeap.remove();
            if(first != second)
                maxHeap.add(-(first - second));
        }

        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }
}

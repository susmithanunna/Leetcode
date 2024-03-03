class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxheap.add(stones[i]);
        }
        while(maxheap.size()>1){
            int t1=maxheap.poll();
            int t2=maxheap.poll();
            maxheap.add(t1-t2);
          
        }
        return maxheap.poll();
    }
}
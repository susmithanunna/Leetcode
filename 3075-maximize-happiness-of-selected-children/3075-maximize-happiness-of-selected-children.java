class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
       PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:happiness){
            pq.add(i);
        }
        int c=0;
        long ans=0;
        for(int i=0;i<k;i++){
           ans+=(int)Math.max(pq.poll()-c,0);
            c++;
        }
        return ans;
        
    }
}
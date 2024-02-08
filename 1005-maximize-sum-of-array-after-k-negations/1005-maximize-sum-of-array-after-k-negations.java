import java.util.*;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.offer(nums[i]);
        }
        while(k!=0){
            int a=pq.poll();
            pq.offer(-1*a);
            k--;
        }
        while(pq.size()!=0){
            sum=sum+pq.poll();
        }
        return sum;
    }
}
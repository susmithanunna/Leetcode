class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n=nums.length;
        Integer diff[]=new Integer[n];
        long sum=0;
        for(int i=0;i<n;i++){
            diff[i]=(nums[i]^k)-nums[i];
            sum=sum+nums[i];
        }
        Arrays.sort(diff,(a,b)->b-a);
        for(int i=0;i<n-1;i=i+2){
            int t=diff[i]+diff[i+1];
            if(t>0){
                sum=sum+t;
            }
        }
        return sum;
    }
}
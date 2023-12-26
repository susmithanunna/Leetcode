class Solution {
    public int maxSubArray(int[] nums) {
        //kadane's algorithm
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
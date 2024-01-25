class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int mid=-1;
        if(n%2==0){
           mid=n/2-1; 
        }
        else{
            mid=n/2;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+(int)Math.abs(nums[i]-nums[mid]);
        }
        return ans;
    }
}
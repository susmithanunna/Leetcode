class Solution {
    public int rob(int[] nums) {
         int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int ans1=find(nums,0,n-1);
        int ans2=find(nums,1,n);
        return (int)Math.max(ans1,ans2);
    }
    public int find(int nums[],int start,int end){
        int prev=nums[start];
        if(start+1<end){
           prev=(int)Math.max(nums[start],nums[start+1]);
        }
        
        int sprev=nums[start];
        for(int i=start+2;i<end;i++){
            int pick=nums[i]+sprev;
            int notpick=0+prev;
            sprev=prev;
            prev=(int)Math.max(pick,notpick);
        }
        return prev;
        
    }
}
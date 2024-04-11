class Solution {
    public int rob(int[] nums) {
        // int n=nums.length;
        // if(n==1){
        //     return nums[0];
        // }
        // int dp1[]=new int[n];//take 1st element and leave last element
        // int dp2[]=new int[n];
        // dp1[0]=nums[0];
        // dp1[1]=(int)Math.max(nums[1],nums[0]);
        // dp2[0]=0;
        // dp2[1]=nums[1];//skipping 1st element in the array
        // for(int i=2;i<n;i++){
        //     if(i!=n-1){
        //          dp1[i]=(int)Math.max(dp1[i-1],dp1[i-2]+nums[i]);
        //     }
        //     dp2[i]=(int)Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        // }
        // return (int)Math.max(dp1[n-2],dp2[n-1]);
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
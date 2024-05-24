class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        // boolean dp[][]=new boolean[n][target+1];
        boolean prev[]=new boolean[target+1];
        boolean curr[]=new boolean[target+1];
           prev[0]=true;
              curr[0]=true;
        if(nums[0]<=target){
            prev[nums[0]]=true;
        }
        for(int i=1;i<n;i++){
                
            for(int tar=1;tar<=target;tar++){
                boolean nottake=prev[tar];
                boolean take=false;
                if(nums[i]<=tar){
                    take=prev[tar-nums[i]];
                }
                curr[tar]=take||nottake;
            }
             System.arraycopy(curr, 0, prev, 0, target + 1);
        }
        return prev[target];
    }
}
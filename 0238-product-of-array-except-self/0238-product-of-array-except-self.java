class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int left[]=new int[n];
        int right[]=new int[n];
        int c=1;
        for(int i=0;i<n;i++){
            left[i]=c;
            c=c*nums[i];
        }
        c=1;
        for(int i=n-1;i>=0;i--){
            right[i]=c;
            c=c*nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
            
        }
        return ans;
        
    }
}
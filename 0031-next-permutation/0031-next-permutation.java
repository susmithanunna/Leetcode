class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
          reverse(nums,0,n-1);
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[index]){
                    int t=nums[index];
                    nums[index]=nums[i];
                    nums[i]=t;
                    break;
                }
            }
            reverse(nums,index+1,n-1);
        }
    }
    public void reverse(int nums[],int i,int j){
       while(i<j){
           int t=nums[i];
           nums[i]=nums[j];
           nums[j]=t;
           i++;
           j--;
       }
    }
}
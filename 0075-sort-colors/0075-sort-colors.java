class Solution {
    public void sortColors(int[] nums) {
        int cz=0;
        int co=0;
        int ct=0;
        int n=nums.length;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
              cz++;
          }
          else if(nums[i]==1){
              co++;
          }
          else{
              ct++;
          }
      }  
        for(int i=0;i<cz;i++){
            nums[i]=0;
        }
        for(int i=cz;i<co+cz;i++){
            nums[i]=1;
        }
        for(int i=co+cz;i<n;i++){
            nums[i]=2;
        }
    }
}
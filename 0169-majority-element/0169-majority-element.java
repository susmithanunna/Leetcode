class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                c++;
            }
            else{
                c--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el){
                return el;
            }
        }
        return el;
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        Integer c;
        for(int i=0;i<nums.length;i++){
            if(h1.get(nums[i])!=null){
                if((int)Math.abs(i-h1.get(nums[i]))<=k){
                    return true;
                }
            }
            h1.put(nums[i],i);
        }
        return false;
    }
}
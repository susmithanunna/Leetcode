class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> l=new HashMap<>();
        Integer c;
        for(int i=0;i<nums.length;i++){
            int v=target-nums[i];
            c=l.get(nums[i]);
            if(l.containsKey(v)){
                return new int[]{i,l.get(v)};
            }
            if(c==null){
                c=0;
            }
            l.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
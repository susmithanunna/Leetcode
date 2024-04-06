class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        Integer c;
        for(int i=0;i<nums.length;i++){
            c=h1.get(nums[i]);
            if(c==null){
                c=0;
            }
            h1.put(nums[i],c+1);
        }
        for(Integer i:h1.keySet()){
            if(h1.get(i)>2){
                return false;
            }
        }
        return true;
    }
}
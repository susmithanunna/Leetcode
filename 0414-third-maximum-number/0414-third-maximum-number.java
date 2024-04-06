class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!a1.contains(nums[i])){
                a1.add(nums[i]);
            }
            
        }
       Collections.sort(a1);
        if(a1.size()>=3){
            return a1.get(a1.size()-3);
        }
        return a1.get(a1.size()-1);
        
    }
}
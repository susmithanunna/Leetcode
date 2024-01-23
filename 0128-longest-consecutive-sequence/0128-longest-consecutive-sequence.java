class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int c=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i:s){
            if(!s.contains(i-1)){
                int x=i;
                  c=1;
                while(s.contains(x+1)){
                    x=x+1;
                    c=c+1;
                }
                max=(int)Math.max(c,max);
                
            }
        }
        return max;
    }
}
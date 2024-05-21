class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<(int)Math.pow(2,n);i++){
            List<Integer> l1=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    l1.add(nums[j]);
                }
            }
            ans.add(l1);
        }
        return ans;
    }
}
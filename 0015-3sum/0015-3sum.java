class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[k]);
                    l.add(l1);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return l;
    }
}
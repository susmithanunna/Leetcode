class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<Integer> a1 =new ArrayList<>();
        Arrays.sort(nums);
         return find(0,nums,k,a1)-1;
        
    }
    public int find(int i,int nums[],int k, ArrayList<Integer> a1){
        if(i==nums.length){
            return 1;
        }
        int take=0;
        int nottake=0;
        if(!a1.contains(nums[i]-k) && !a1.contains(nums[i]+k)){
            a1.add(nums[i]);
            take=find(i+1,nums,k,a1);
            a1.remove(a1.size()-1);
        }
        nottake=find(i+1,nums,k,a1);
        return take+nottake;
    } 
}
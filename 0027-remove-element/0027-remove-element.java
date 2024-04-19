class Solution {
    public int removeElement(int[] nums, int val) {
       ArrayList<Integer> a1=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                a1.add(nums[i]);
                k++;
            }
            
        }
        //int nums[]=new int[a1.size()];
        for(int i=0;i<a1.size();i++){
            nums[i]=a1.get(i);
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=(int)1e9;
        }
        return k ;
    }
}
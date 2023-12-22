class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String ans="";
        String arr[]=new String[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }
            arr[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(arr,(n1,n2)->(n2+n1).compareTo(n1+n2));
        for(int i=0;i<n;i++){
            ans=ans+arr[i];
        }
        if(c==n){
            return "0";
        }
        return ans;
    }
}
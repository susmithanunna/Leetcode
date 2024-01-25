class Solution {
    public int minOperations(int n) {
        int mid=-1;
        int ans=0;
        if(n%2==0){
            mid=n/2-1;
            int value=(2*mid)+1;
            for(int i=0;i<n;i++){
            int t=(2*i)+1;
            ans=ans+(int)Math.abs(t-value);
           }
            return ans/2;
        }
        else{
            mid=n/2;
             int value=(2*mid)+1;
            for(int i=mid+1;i<n;i++){
            int t=(2*i)+1;
            ans=ans+(int)Math.abs(t-value);
           }
        }
        return ans;
    }
}
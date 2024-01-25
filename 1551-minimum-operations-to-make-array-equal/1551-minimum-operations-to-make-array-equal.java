class Solution {
    public int minOperations(int n) {
        int mid=-1;
        int ans=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=2*i+1;
        }
        if(n%2==0){
            mid=n/2-1;
            //int value=(2*mid)+1;
            for(int i=0;i<n;i++){
            //int t=(2*i)+1;
            ans=ans+(int)Math.abs(arr[i]-arr[mid]);
           }
            ans=ans/2;
        }
        else{
            mid=n/2;
            //int value=(2*mid)+1;
            for(int i=mid+1;i<n;i++){
            //int t=(2*i)+1;
            ans=ans+(int)Math.abs(arr[i]-arr[mid]);
           }
        }
        
        
        
        
        return ans;
    }
}
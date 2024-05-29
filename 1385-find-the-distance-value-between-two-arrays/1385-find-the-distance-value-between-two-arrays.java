class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                int t=(int)Math.abs(arr1[i]-arr2[j]);
                if(t<=d){
                    c++;
                    break;
                }    
                }
            }
        
        return arr1.length-c;
    }
}
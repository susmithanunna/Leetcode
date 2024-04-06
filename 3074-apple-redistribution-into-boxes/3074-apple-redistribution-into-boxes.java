class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum=sum+apple[i];
        }
        int c=0;
        int n=capacity.length;
        int i=n-1;
        while(sum>=0 && i>=0){
            if(sum==0){
                break;
            }
            sum=sum-capacity[i];
            //System.out.println(sum+" "+capacity[i]);
            i--;
            c++;
        }
        return c;
    }
}
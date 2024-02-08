class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<j){
            int t1=(int)Math.min(height[i],height[j]);
            int t2=j-i;
            ans=(int)Math.max(ans,t1*t2);
            if(t1==height[i]){
                i++;
            }
            else if(t1==height[j]){
                j--;
            }
        }
        return ans;
    }
}
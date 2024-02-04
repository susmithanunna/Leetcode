class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int c=candies;
        int n=1;
        int i=0;
        int ans[]=new int[num_people];
        if(num_people==1){
            ans[0]=candies;
            return ans;
        }
        while(c!=0){
            if(i>=num_people){
                i=0;
            }
            if(n>c){
                n=c;
                ans[i]=ans[i]+n;
                i++;
                n++;
                c=0;
                break;
            }
            else if(n<=candies){
                ans[i]=ans[i]+n;
                c=c-n;
                i++;
                
                n++;
            }
        }
        return ans;
    }
}
class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int c_l[]=new int[n];
        int c_r[]=new int[n];
        int ans[]=new int[n];
        int res=0;
        c_l[0]=1;
        c_r[n-1]=1;
        int j=n-2;
        for(int i=1;i<n;i++){
            if(ratings[i-1]<ratings[i]){
                c_l[i]=c_l[i-1]+1;
            }
            else{
                c_l[i]=1;
            }
            if(ratings[j+1]<ratings[j]){
                c_r[j]=c_r[j+1]+1;
                j--;
            }
            else{
                c_r[j]=1;
                j--;
            }
        }
       for(int i=0;i<n;i++){
           ans[i]=(int)Math.max(c_r[i],c_l[i]);
           res=res+ans[i];
       } 
        return res;
    }
}
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[]=new int[2];
        int max_row=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c>max){
                max=c;
                max_row=i;
            }
        }
        ans[0]=max_row;
        ans[1]=max;
        return ans;
    }
}
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int ans[]=new int[m*n];
        int c=0;
        int row=0;
        int col=0;
        while(c<m*n){
            while(row>=0 && col<n){
                if(row>=0 && col>=0 && row<m && col<n ){
                    ans[c]=mat[row][col];
                    c++;
                    mat[row][col]=(int)1e9;
                }
                row--;
                col++;
            }
            if(c==m*n){
                break;
            }
            row=(int)Math.max(row+1,0);
            col=(int)Math.min(col,n-1);
            while(mat[row][col]==(int)1e9){
                row++;
            }
            while(row<m && col>=0){
                if(row>=0 && col>=0 && row<m && col<n){
                    ans[c]=mat[row][col];
                    c++;
                    mat[row][col]=(int)1e9;
                }
                row++;
                col--;
            }
            if(c==m*n){
                break;
            }
            row=(int)Math.min(row,m-1);
            col=(int)Math.max(col+1,0);
            while(mat[row][col]==(int)1e9){
                col++;
            }
        }
        return ans;
    }
}
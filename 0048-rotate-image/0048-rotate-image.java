class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            int l=0;
            int h=m-1;
            while(l<h){
                int t=matrix[i][l];
                matrix[i][l]=matrix[i][h];
                matrix[i][h]=t;
                l++;
                h--;
            }
        }
    }
    
}
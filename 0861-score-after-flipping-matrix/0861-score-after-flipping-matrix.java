class Solution {
    public int matrixScore(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            if(grid[i][0] == 0){
                for(int j=0; j<grid[0].length; j++){
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        for(int j=1; j<grid[0].length; j++){
            int count = 0;
            for(int i=0; i<grid.length; i++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
            if(count*2 < grid.length){
                for(int i=0; i<grid.length; i++){
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        int sum = 0;

        for(int i=0; i<grid.length; i++){
            int row = 0;
            for(int j=0; j<grid[0].length; j++){
                row = row*2 + grid[i][j];
            }
            sum += row;
        }

        return sum;  
    }
}
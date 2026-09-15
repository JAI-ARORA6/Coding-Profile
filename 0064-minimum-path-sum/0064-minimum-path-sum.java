class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] num:dp){
            Arrays.fill(num,-1);
        }
        return fun(grid,0,0,m,n,dp);
    }
    public int fun(int[][] grid,int i,int j,int m,int n,int[][] dp){
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int right=Integer.MAX_VALUE;
        int down=Integer.MAX_VALUE;

       if(j<n-1) {
        right=fun(grid,i,j+1,m,n,dp)+grid[i][j];}

       if(i<m-1) {
        down=fun(grid,i+1,j,m,n,dp)+grid[i][j];
       }

        return dp[i][j]=Math.min(right,down);
    }
}
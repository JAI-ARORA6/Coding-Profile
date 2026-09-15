class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
         int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return fun(obstacleGrid,0,0,m,n,dp);
    }
    public int fun(int[][] a,int x,int y,int m,int n,int[][] dp){
            
            if(dp[x][y]!=-1){
                return dp[x][y];
            }

            if(a[x][y]==1){
                return 0;
            }
if(x==m-1 && y==n-1){
                return 1;
            }
            int right=0;
            int down=0;

            if(x<m-1){
                right=fun(a,x+1,y,m,n,dp);
            }
            if(y<n-1){
                down=fun(a,x,y+1,m,n,dp);
            }

            return dp[x][y]=right+down;
        }
}
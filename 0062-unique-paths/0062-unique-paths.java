class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return fun(0,0,m,n,dp);
        }

        public int fun(int x,int y,int m,int n,int[][] dp){
            if(x==m-1 && y==n-1){
                return 1;
            }
            if(dp[x][y]!=-1){
                return dp[x][y];
            }

            int right=0;
            int down=0;

            if(x<m-1){
                down=fun(x+1,y,m,n,dp);
            }
            if(y<n-1){
                right=fun(x,y+1,m,n,dp);
            }

            return dp[x][y]=right+down;
        }
}
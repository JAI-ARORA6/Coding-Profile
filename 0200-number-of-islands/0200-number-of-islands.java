class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int res=0;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&& vis[i][j]==false){
                    dfs(i,j,n,m,grid,vis);
                    res++;
                }
            }
        }
        return res;

    }
    int[] x={-1,1,0,0};
    int[] y={0,0,-1,1};
    public void dfs(int i,int j,int n,int m,char[][] grid,boolean[][] vis){
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];
            if(row>=0 && row<n && col>=0 && col<m &&(grid[row][col]=='1' && vis[row][col]==false)){
                dfs(row,col,n,m,grid,vis);
            }
        }
        return;

    }
}
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      
        int m=grid.length;
        int n=grid[0].length;
        int maxArea=0;
        boolean[][] vis=new boolean[m][n]; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 &&!vis[i][j]){
                int area =dfs(i,j,n,m,grid,vis);
                maxArea=Math.max(maxArea,area);
                }
            }

        }
        return maxArea;
    }
    int[] x={-1,1,0,0};
    int[] y={0,0,-1,1};
    
    public int dfs(int i,int j,int n,int m,int[][] grid,boolean[][] vis){
        vis[i][j]=true;
        int area=1;
        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];

            if(row>=0 && col>=0 && row<m && col<n && grid[row][col]==1 && vis[row][col]==false){
                
                area+=dfs(row,col,n,m,grid,vis);
                
            }
        }
        return area;
    }
}
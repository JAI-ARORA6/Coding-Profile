class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        int initcolor=image[sr][sc];

        dfs(sr,sc,image,ans,color,initcolor);
        return ans;

    }

    int[] x={-1,1,0,0};
    int[] y={0,0,-1,1};
    public void dfs(int i,int j,int[][] image,int[][] ans,int color ,int initcolor){
        ans[i][j]=color;
        int n=image.length;
        int m=image[0].length;
        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];
            if(row>=0 && row<n &&col>=0 && col<m &&image[row][col]==initcolor && ans[row][col]!=color){
                dfs(row,col,image,ans,color,initcolor);
            }
        }
    
    }
}
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];
        // for pacific occean top nad left col
        // top
        for(int j=0;j<n;j++){
            dfs(0,j,m,n,heights,pacific);
        }
        // left col
        for(int i=0;i<m;i++){
            dfs(i,0,m,n,heights,pacific);
        }

        // for atlantic ocean bottom row  and right col
        // bottom row

        for(int j=0;j<n;j++){
            dfs(m-1,j,m,n,heights,atlantic);
        }

        // right col
        for(int i=0;i<m;i++){
            dfs(i,n-1,m,n,heights,atlantic);
        }

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
            }
            return ans;
        }
        
    
    int[] x={-1,1,0,0};
    int[] y={0,0,-1,1};
    private void dfs(int i,int j,int m,int n,int[][] heights,boolean[][] visited){
        if(visited[i][j]) return;
        visited[i][j]=true;

        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];
            if(row>=0 && row<m && col>=0 && col<n && !visited[row][col]&& heights[row][col]>=heights[i][j]){
                dfs(row,col,m,n,heights,visited);
            }
        }
    }
}
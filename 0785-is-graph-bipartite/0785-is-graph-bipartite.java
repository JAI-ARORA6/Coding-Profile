class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                dfs(graph,i,0,color);
            }
        }
    return res;
    }
    boolean res=true;
    public void dfs(int[][] a,int node,int c,int[] color){
        color[node]=c;
        for(int neigh:a[node]){
            if(color[neigh]!=-1 && color[neigh]==c){
                res=false;
                
            }
            if(color[neigh]==-1){
                dfs(a,neigh,1-c,color);
            }
        }
        return;
    }
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int a=edge[0];
            int b=edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);

        }

        dfs(source,destination,adj,vis);

        return vis[destination];

    }

    public void dfs(int node ,int destination,List<List<Integer>> adj,boolean[] vis){
        

        vis[node]=true;
        for(int neigh:adj.get(node)){
            if(!vis[neigh]){
                dfs(neigh,destination,adj,vis);
            }
        }
    }
}
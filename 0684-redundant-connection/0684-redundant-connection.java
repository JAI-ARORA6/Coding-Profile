class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=edges.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
           int u=edge[0];
           int v=edge[1];

            boolean[] vis=new boolean[edges.length+1];
           if(dfs(u,v,adj,vis)){
            return edge;
           }

           adj.get(u).add(v);
           adj.get(v).add(u);
        }

        return new int[0];
    }

    private boolean dfs(int node ,int target,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        if(node==target){
            return true;
        }
        vis[node]=true;

        for(int neigh:adj.get(node)){
            if(!vis[neigh]){
                if(dfs(neigh,target,adj,vis)){
                    return true;
                }
            }
        }
        return false;
    }
}
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>(numCourses);
        int n=prerequisites.length;
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
int endegree[]=new int[numCourses];
        for(int i=0;i<n;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            endegree[prerequisites[i][0]]++;
        }

        
        

        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(endegree[i]==0){
                q.add(i);
            }
        }
        int[] topo=new int[numCourses];
        int cnt=0;
        while(!q.isEmpty()){
            int node=q.poll();
            topo[cnt++]=node;
            
            for(int it:adj.get(node)){
                endegree[it]--;
                if(endegree[it]==0){
                    q.add(it);
                }
            }
        }
        if(numCourses==cnt){
            return topo;
        }
        return new int[0];
    }
}
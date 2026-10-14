class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> ans=new ArrayList<>();
        boolean insert=false;

        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            if(!insert && start>= newInterval[0]){
                ans.add(newInterval);
                insert=true;
            }
            ans.add(intervals[i]);
        }
        if(!insert) ans.add(newInterval);
        return merge(ans.toArray(new int[ans.size()][]));
    }

    public int[][] merge(int[][] intervals){
        int n=intervals.length;
        List<int[]> ans=new ArrayList<>();
        int[] prev=intervals[0];

        for(int i=0;i<n;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }
            else{
                ans.add(prev);
                prev=intervals[i];
            }
        }
        ans.add(prev);
        return ans.toArray(new int[ans.size()][]);
    }
}
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        ArrayList<ArrayList<Integer>> dp=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> t=new ArrayList<>();
           t.add(-1); 
            t.add(-1); 
            dp.add(t);

        }
        return fun(nums,n,0,1,dp);
    }

    public int fun(int[] nums,int n,int i,int free,ArrayList<ArrayList<Integer>> dp){
        if(i==n){
            return 0;

        }
        if(dp.get(i).get(free)!=-1){
            return dp.get(i).get(free);
        }

        if(free==0){
            int ans=fun(nums,n,i+1,1,dp);
            dp.get(i).set(free,ans);
            
            return ans;
        }
        int c1=nums[i]+fun(nums,n,i+1,0,dp);
        int c2=fun(nums,n,i+1,1,dp);
        int max=Math.max(c1,c2);
        dp.get(i).set(free,max);
        return max;
    }

}
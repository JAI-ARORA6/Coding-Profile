class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        Integer[][] dp=new Integer[n][n];
        
        return fun(triangle,0,0,n,dp);
    }

    public int fun(List<List<Integer>> list,int i,int j,int n,Integer[][] dp){
        if(i==n-1){
            return list.get(i).get(j);
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }

        int down=list.get(i).get(j)+fun(list,i+1,j,n,dp);
        int digonal=list.get(i).get(j)+fun(list,i+1,j+1,n,dp);

        return dp[i][j]=Math.min(down,digonal);
    }
}
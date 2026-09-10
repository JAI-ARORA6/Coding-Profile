class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return fun(s,0,dp);
    }
    public int fun(String s,int i,int[] dp){
        if(i==s.length()){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        if(s.charAt(i)=='0'){
            return 0;
        }

        int ways=fun(s,i+1,dp);

        if(i+1<s.length() && Integer.parseInt(s.substring(i,i+2))<=26){
            ways+=fun(s,i+2,dp);
        }

        dp[i]=ways;
        return ways;
    }
}
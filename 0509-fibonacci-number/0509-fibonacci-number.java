class Solution {
    public int fib(int n) {
       HashMap<Integer,Integer> dp=new HashMap<>();

        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

    if(dp.containsKey(n)){
        return dp.get(n);
    }
        int ans1=fib(n-1);
        int ans2=fib(n-2);
        int ans=ans1+ans2;
        dp.put(n,ans);
        return ans;
    }
}
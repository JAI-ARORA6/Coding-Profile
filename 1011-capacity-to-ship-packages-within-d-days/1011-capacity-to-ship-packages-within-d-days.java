class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int n=weights.length;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            max=Math.max(weights[i],max);
        }
        int res=0;
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(fun(weights,n,mid)<=days){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;

    }
    public int fun(int[] a,int n,int guess){
        int count=1;
        int load=0;
        for(int i=0;i<n;i++){
            if(load+a[i]>guess){
                count++;
                load=a[i];
            }
            else{
                load+=a[i];
            }
            
        }
        return count;
    }
}
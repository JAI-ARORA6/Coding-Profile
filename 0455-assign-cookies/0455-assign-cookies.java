class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n1=g.length;
        int n2=s.length;
        int l=0,r=0;
        while(l<n2 && r<n1){
            if(g[r]<=s[l]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }
}
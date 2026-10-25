class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int guess=low+(high-low)/2;
            int h=n-guess;
            if(citations[guess]>=h){
                high=guess-1;
            }
            else {
                low=guess+1;
            }
        }
        return n-low;
    }

    
}
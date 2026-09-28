class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            freq.put(hand[i],freq.getOrDefault(hand[i],0)+1);
        }
        for(int num:hand){
            if(freq.get(num)==0) continue;
            for(int i=0;i<groupSize;i++){
                if(freq.getOrDefault(num+i,0)==0) return false;
                freq.put(num+i,freq.get(num+i)-1);
            }
        }
        return true;

    }
}
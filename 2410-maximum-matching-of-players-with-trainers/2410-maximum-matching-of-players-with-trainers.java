class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int p=players.length;
        int t=trainers.length;
        int l=0;
        int r=0;
        while(l<t && r<p){
            if(players[r]<=trainers[l]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }
}
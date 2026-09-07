class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        int[] res=new int[friends.length];
        int j=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                res[j]=order[i];
                j++;
            }
        }
        return res;
    }
}
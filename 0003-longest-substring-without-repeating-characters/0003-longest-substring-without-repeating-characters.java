class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int low=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int high=0;high<s.length();high++){
            char c=s.charAt(high);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char leftchar=s.charAt(low);
                map.put(leftchar,map.get(leftchar)-1);
                low++;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}
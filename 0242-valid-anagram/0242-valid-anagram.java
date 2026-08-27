class Solution {
    public boolean isAnagram(String s, String t) {
    char  s1[]=s.toCharArray();
    Arrays.sort(s1);     
    char  s2[]=t.toCharArray();
    Arrays.sort(s2);
    if(s1.length!=s2.length){
        return false;
    }     
    return Arrays.equals(s1, s2);

    }
}
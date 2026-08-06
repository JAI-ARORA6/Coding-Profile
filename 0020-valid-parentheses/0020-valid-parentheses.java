class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='['|| s.charAt(i)=='{'){
                st.add(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
            

            if(s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }
            else if(s.charAt(i)==']' && st.peek()=='['){
                st.pop();
            }
            else if(s.charAt(i)=='}' && st.peek()=='{'){
                st.pop();
            }
            else{
                return false;
            }
        }
        }
        return st.isEmpty();
    }
}
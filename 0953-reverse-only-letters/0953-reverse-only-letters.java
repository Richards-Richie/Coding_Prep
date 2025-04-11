class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                st.push(c);
            }
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                ans.setCharAt(i,st.pop());
            }
        }
        return ans.toString();
    }
}
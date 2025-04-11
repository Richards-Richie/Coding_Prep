class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder ans =new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char lc=Character.toLowerCase(s.charAt(i));
            if(lc =='a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u' ){
                st.push(s.charAt(i));
            }
        }
        for(int i=0;i<ans.length();i++){
            char lc=Character.toLowerCase(ans.charAt(i));
            if(lc =='a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u' ){
                ans.setCharAt(i,st.pop());
            }
        }
        return ans.toString();
    }
}
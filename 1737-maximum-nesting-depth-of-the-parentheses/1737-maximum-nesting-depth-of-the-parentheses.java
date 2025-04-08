class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int maxlength=0;
        if(n == 0){
            return maxlength;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                maxlength=Math.max(maxlength,st.size());
                st.pop();
            }
        }
        return maxlength;
    }
}
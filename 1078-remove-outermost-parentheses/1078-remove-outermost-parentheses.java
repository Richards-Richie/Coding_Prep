class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int depth=0;
        String ans="";
        for(char c : s.toCharArray()){
            if(c == '('){
                if(depth > 0){
                    ans=ans+c;
                }
                depth++;
            }else{
                depth--;
                if(depth > 0){
                    ans=ans+c;
                }
            }
        }
        return ans;
    }
}
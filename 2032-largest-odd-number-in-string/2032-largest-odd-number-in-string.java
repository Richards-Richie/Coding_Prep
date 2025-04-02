class Solution {
    public String largestOddNumber(String num) {
       int n=num.length();
       for(int i=n-1; i>=0; i--){
            int endnum=num.charAt(i) - '0';
            if(endnum % 2 == 1){
                String ans=num.substring(0,i+1);
                return ans;
            }
       }
       return "";
    }
}
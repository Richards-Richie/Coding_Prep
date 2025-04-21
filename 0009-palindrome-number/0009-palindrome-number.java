class Solution {
    public boolean isPalindrome(int x) {
        String input=x+""; 
        return findpalindrome(input);
    }
    public boolean findpalindrome(String s){
        int n=s.length();
        if(n == 0){
            return true;
        }
        int left =0;
        int right=n-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
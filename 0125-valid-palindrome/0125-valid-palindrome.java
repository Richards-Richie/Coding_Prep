class Solution {
    public boolean isPalindrome(String s) {
        String converted = getString(s);
        int n=converted.length();
        int i=0;
        int j=n-1;
        while(i <= j){
            if(converted.charAt(i) !=converted.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String getString(String s){
        StringBuilder ans =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans.append(Character.toLowerCase(c));
            }
        }
        return ans.toString();
    }
}
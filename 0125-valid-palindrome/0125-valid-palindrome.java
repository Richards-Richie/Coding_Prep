class Solution {
    public boolean isPalindrome(String s) {
        String sbs=getString(s);
        for(int i=0;i*2<sbs.length();i++){
            if(sbs.charAt(i)!= sbs.charAt(sbs.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public String getString(String s){
        StringBuffer sb=new StringBuffer();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
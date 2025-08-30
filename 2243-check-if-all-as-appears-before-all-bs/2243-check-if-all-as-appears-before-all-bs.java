class Solution {
    public boolean checkString(String s) {
        int bindex=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'b' == 0){
                bindex = i;
                break;
            }
        }
        if(bindex == -1){
            return true;
        }
        for(int i=bindex+1;i<s.length();i++){
            if(s.charAt(i)-'a' == 0){
                return false;
            }
        }
        return true;
    }
}
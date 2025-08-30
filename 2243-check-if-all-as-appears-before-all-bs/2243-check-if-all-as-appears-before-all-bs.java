class Solution {
    public boolean checkString(String s) {
        int bindex =-1;
        int n=s.length();
        if(s.length() == 0){
            return true;
        }
        bindex = s.indexOf('b');
        if(bindex == -1){
            return true;
        }
        for(int i=bindex+1;i<n;i++){
            if(s.charAt(i) == 'a'){
                return false;
            }
        }
        return true;

    }
}
class Solution {
    public boolean isCircularSentence(String s) {
        int n=s.length();
        char f=s.charAt(0);
        char l=s.charAt(n-1);
        if( f != l){
            return false;
        }
        
        for(int i=0;i<n;i++){
            if(s.charAt(i) == ' '){
                char prev=s.charAt(i-1);
                char last=' ';
                if(i+1 < n){
                    last=s.charAt(i+1);
                }else{
                    return false;
                }
                if(prev!=last){
                    return false;
                }
            }
        }
        return true;
    }
}
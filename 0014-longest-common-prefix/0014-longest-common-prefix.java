class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minlen=minLen(strs);
        if(minlen == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String word=strs[0];
        for(int i=1;i<strs.length;i++){
            String wordcmp=strs[i];
            for(int j=0;j<minlen;j++){
                if(wordcmp.charAt(j) !=word.charAt(j)){
                    minlen=j;
                    break;
                }
            }
        }
        if(minlen < 0){
            return "";
        }else{
            return strs[0].substring(0,minlen);
        }
    }
    public int minLen(String []strs){
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            minlen=Math.min(minlen,strs[i].length());
        }
        return minlen;
    }
}
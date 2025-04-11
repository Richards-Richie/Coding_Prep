class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans=new StringBuilder(s);
        if(ans.length() < k){
            return ans.reverse().toString();
        }
        int start=0;
        while(start < ans.length()){
            int end=start + 2 * k;
            if(end < ans.length() ){
                StringBuilder rev=new StringBuilder(ans.substring(start,start+k));
                ans.replace(start,start+k,rev.reverse().toString());
                start = start+2 * k;
            }else{
                if(start + k < ans.length()){
                    StringBuilder rev=new StringBuilder(ans.substring(start,start+k));
                    ans.replace(start , start + k, rev.reverse().toString());
                }else{
                    StringBuilder rev=new StringBuilder(ans.substring(start,ans.length()));
                    ans.replace(start,ans.length(),rev.reverse().toString());
                }
                start = start + 2* k;
            }
        }
        return ans.toString();
    }
}
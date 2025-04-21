class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        int n=s.length();
        if(n == 0){
            return 0;
        }
        int left=0;
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(m.containsKey(c) && m.get(c) >= left){
                left=m.get(c)+1;
            }
            m.put(c,i);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
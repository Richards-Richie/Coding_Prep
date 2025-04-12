class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        int maxlen=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(m.containsKey(c) && m.get(c)>=left){
                left=m.get(c)+1;

            }
            m.put(c,i);
            maxlen=Math.max(maxlen,(i-left)+1);
        }
        return maxlen;
    }
}
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int curval=m.get(s.charAt(i));
            if(i+1 < n && curval < m.get(s.charAt(i+1))){
                int totalval=m.get(s.charAt(i+1));
                ans+=(totalval-curval);
                i++;
            }else{
                ans+=curval;
            }
        }
        return ans;
    }
}
class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        Map<Character,Integer> m=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }   
        for(Map.Entry ele : m.entrySet()){
            int val=(int)ele.getValue();
            if(val == 1){
                return s.indexOf((char)ele.getKey());
            }
        }
        return -1;
    }
}
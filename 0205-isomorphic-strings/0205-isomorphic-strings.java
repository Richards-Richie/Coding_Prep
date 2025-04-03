class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>m=new HashMap<>();
        int n=s.length();
        if(n != t.length()){
            return false;
        }
        for(int i=0;i<n;i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),t.charAt(i));
            }else{
                char k=m.get(s.charAt(i));
                if(k != t.charAt(i)){
                    return false;
                }
            }
        }
        m.clear();
        for(int i=0;i<n;i++){
            if(!m.containsKey(t.charAt(i))){
                m.put(t.charAt(i),s.charAt(i));
            }else{
                char k=m.get(t.charAt(i));
                if(k!= s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
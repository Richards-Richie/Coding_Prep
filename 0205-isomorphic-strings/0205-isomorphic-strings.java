class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        if(n != t.length()){
            return false;
        }
        if(determine(s,t)== false){
            return false;
        }else{
            return determine(t,s);
        }

        
    }
    public boolean determine(String s,String t){
        HashMap<Character,Character> m=new HashMap<>();
        int n=s.length();
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
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> []bc=new List[s.length()+1];
        for(char c : m.keySet()){
            int freq=m.get(c);
            if(bc[freq] == null){
                bc[freq] =new ArrayList<>();
            }
            bc[freq].add(c);
        }

        StringBuilder ans=new StringBuilder();
        for(int i=bc.length-1;i>=0;i--){
            if(bc[i] != null){
                for(char c : bc[i]){
                    for(int j=i;j>0;j--){
                        ans.append(c);
                    }
                }
            }
        }
        return ans.toString();
    }
}
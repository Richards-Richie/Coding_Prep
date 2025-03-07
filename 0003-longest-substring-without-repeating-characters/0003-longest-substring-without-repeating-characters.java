class Solution {
    public int lengthOfLongestSubstring(String s) {
       int leftIndex=0;
       int maxLength=0;
       int n=s.length();
       HashMap<Character,Integer> m1=new HashMap<>();
       for(int rightIndex=0;rightIndex<n;rightIndex++){
            char currChar=s.charAt(rightIndex);
            if(m1.containsKey(currChar) && m1.get(currChar) >=leftIndex){
                leftIndex=m1.get(currChar)+1;
            }
            m1.put(currChar,rightIndex);
            maxLength=Math.max(maxLength,(rightIndex-leftIndex)+1);
       }
       return maxLength; 
    }
    
}
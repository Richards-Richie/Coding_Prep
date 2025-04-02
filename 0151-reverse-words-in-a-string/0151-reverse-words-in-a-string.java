class Solution {
    public String reverseWords(String s) {
        ArrayList<String> st=new ArrayList<>();
        int n=s.length();
        boolean b=false;
        int start=0;
        int end=n-1;
        String ans="";

        for(int i=0;i<n;i++){
            if(s.charAt(i) != ' ' ){
                if(b == false){
                    start = i;
                    b=!b;
                }
                if(i == n-1){
                    end = i;
                    String word=s.substring(start,end+1);
                    b=!b;
                    st.add(word);
                }
            }else{
                if(b == true){
                    end=i-1;
                    String word=s.substring(start,end+1);
                    b=!b;
                    st.add(word);
                }
            }
        }

        for(int i=st.size()-1;i>=0;i--){
            if(i == 0){
                ans=ans+st.get(i);
            }else{
                ans=ans+st.get(i)+" ";
            }
        }

        return ans;
    }
}
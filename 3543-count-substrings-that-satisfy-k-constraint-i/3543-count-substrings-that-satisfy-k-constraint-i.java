class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int cone=0;
            int czero=0;
            for(int j=i;j<n;j++){
                czero=(s.charAt(j) == '0')?czero+1:czero;
                cone=(s.charAt(j) == '1')?cone+1:cone;
                if(czero <= k || cone <= k){
                    count++;
                }
            }
        }
        return count;
    }
}
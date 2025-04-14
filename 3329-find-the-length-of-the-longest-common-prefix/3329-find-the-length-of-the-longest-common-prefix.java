class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> s1=new HashSet<>();
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            String a=String.valueOf(arr1[i]);
            for(int j=1;j<=a.length();j++){
                s1.add(a.substring(0,j));
            }
        }
        for(int i=0;i<arr2.length;i++){
            String a=String.valueOf(arr2[i]);
            for(int j=1;j<=a.length();j++){
                if(s1.contains(a.substring(0,j))){
                    ans=Math.max(ans,j);
                }
            }
        }
        return ans;
    }
}
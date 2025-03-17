class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans =new ArrayList<>();
        if(n < 0){
            return ans;
        }
        List<Integer> first=new ArrayList<>();
        first.add(1);
        ans.add(first);
        for(int i=1;i<n;i++){
            List<Integer> cur=new ArrayList<>();
            List<Integer> prev=ans.get(i-1);
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(prev.get(j-1)+prev.get(j));
            }
            cur.add(1);
            ans.add(cur);
        }
        return ans;
    }
}
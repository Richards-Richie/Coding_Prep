class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>first=new ArrayList<>();
        first.add(1);
        ans.add(first);
        if(rowIndex == 0){
            return first;
        }
        for(int i=1;i<rowIndex+1;i++){
            List<Integer> cur=new ArrayList<>();
            List<Integer> prev=ans.get(i-1);
            cur.add(1);
            for(int j=0;j<prev.size()-1;j++){
                int addval=prev.get(j)+prev.get(j+1);
                cur.add(addval);
            }
            cur.add(1);
            ans.add(cur);
        }
        return ans.get(rowIndex);
    }
}
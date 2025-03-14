class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
        int n=nums.length;
        if(n <= 1){
            return nums;
        }
        List<int[]> ans=new ArrayList<>();
        int []cur=nums[0];
        ans.add(cur);
        for(int []num:nums){
            if(cur[1] >= num[0]){
                cur[1]=Math.max(cur[1],num[1]);
            }else{
                cur=num;
                ans.add(cur);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}




























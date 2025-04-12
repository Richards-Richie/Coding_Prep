class Solution {
    public void setZeroes(int[][] nums) {
        Set<Integer> r=new HashSet<>();
        Set<Integer> c=new HashSet<>();
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums[i][j] == 0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(r.contains(i) || c.contains(j)){
                    nums[i][j]=0;
                }
            }
        }
    }
}
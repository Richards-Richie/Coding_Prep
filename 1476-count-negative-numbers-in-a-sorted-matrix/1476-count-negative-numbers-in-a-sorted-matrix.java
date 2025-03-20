class Solution {
    public int countNegatives(int[][] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int size=nums[i].length;
            for(int j=0;j<size;j++){
                if(nums[i][j] < 0){
                    count+=size-j;
                    break;
                }
            }
        }
        return count;
    }
}
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            int size=grid[i].length;
            int index=bns(grid[i]);
            if(index != -1){
                count+=size-index;
            }
        }
        return count;
    }
    public int bns(int []nums){
        int start=0;
        int end=nums.length;
        while(start < end){
            int mid=start+(end-start)/2;
            if(nums[mid] < 0){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
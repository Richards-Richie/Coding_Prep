class Solution {
    public void setZeroes(int[][] nums) {
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        int rindex=0;
        int cindex=0;
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        while(rindex < row.size() ){
            int zerorow=row.get(rindex);
            rindex++;
            int zerocol=col.get(cindex);
            cindex++;
            nums=zeros(nums,zerorow,zerocol);
        }

    }
    public static int[][] zeros(int [][]nums,int row,int col){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i == row || j==col){
                    nums[i][j]=0;
                }
            }
        }
        return nums;
    }
}
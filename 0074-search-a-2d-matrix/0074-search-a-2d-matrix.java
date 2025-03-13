class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=-1;
        int n=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            if(target == matrix[i][n-1]){
                return true;
            }
            else if(target < matrix[i][n-1] ){
                row=i;
                break;
            }
        }
        if(row == -1){
            return false;
        }
        return binSearch(matrix[row],0,n-1,target);
    }
    public boolean binSearch(int []arr,int start,int end,int target){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
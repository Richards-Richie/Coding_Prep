class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int []peak=new int[2];
        peak[0]=arr[0];
        peak[1]=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                if(peak[0] <= arr[i]){
                    peak[0]=arr[i];
                    peak[1]=i;
                }
            }
        }
        return peak[1];
    }
}
class Solution {
    public int trap(int[] height) {
        int []lb=new int[height.length];
        lb[0]=height[0];
        int []rb=new int[height.length];
        int trappedwater=0;
        int n=height.length;
        rb[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            lb[i]=Math.max(lb[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            rb[i]=Math.max(rb[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            trappedwater+=Math.min(lb[i],rb[i])-height[i];
        }
        return trappedwater;
    }
}
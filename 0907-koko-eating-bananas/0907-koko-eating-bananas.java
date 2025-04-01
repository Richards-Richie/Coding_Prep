class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=maxi(piles);
        while(start < end){
            int mid=start+(end-start)/2;
            if(total(piles,mid) <= h){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public int maxi(int[] piles){
        int maxival=Integer.MIN_VALUE;
        for(int ele : piles){
            maxival=Math.max(ele,maxival);
        }
        return maxival;
    }
    public int total(int []piles,int k){
        int totalval=0;
        double kval=(double)k;
        for(int ele: piles){
            totalval+= (int)Math.ceil(ele/kval);
        }
        return totalval;
    }
}
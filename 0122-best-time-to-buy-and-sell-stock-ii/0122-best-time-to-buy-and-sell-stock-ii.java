class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=0;
        int profit=0;
        int maxi=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i] < buy ){
                buy=prices[i];
            }else{
                sell=prices[i];
                profit = sell-buy;
                maxi+=profit;
                buy=prices[i];

            }
        }
        Arrays.sort(prices);

        return maxi;
    }
}
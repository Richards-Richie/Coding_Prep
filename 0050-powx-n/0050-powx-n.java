class Solution {
    public double myPow(double x, int n) {
        if(x == 1){
            return x;
        }
        long N=n;
        if(N < 0){
            N=-N;
            x=1/x;
        }
        return recursivePow(x,N);
    }
    public double recursivePow(double x,long n){
        if(n == 0){
            return 1;
        }
        double ans=recursivePow(x,n/2);
        if(n%2 == 1){
            return ans * ans * x;
        }else{
            return ans*ans;
        }
    }
}
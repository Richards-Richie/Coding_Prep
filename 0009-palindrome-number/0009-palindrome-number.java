class Solution {
    public boolean isPalindrome(int x) {
        int val=x;
        int ans=0;
        if(x < 0 ){
            return false;
        }
        while(x != 0){
            int temp=x%10;
            x=x/10;
            ans=ans*10+temp;
            
        }
        if(ans == val ){
            return true;
        }
        return false;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        return checkPali(s,0,s.length()-1);
    }
    public boolean checkPali(String s,int left,int right){
        if(left >= right){
            return true;
        }

        char le=s.charAt(left);
        char ri=s.charAt(right);

        if(!Character.isLetterOrDigit(le)){
            return checkPali(s,left+1,right);
        }

        if(!Character.isLetterOrDigit(ri)){
            return checkPali(s,left,right-1);
        }

        if(Character.toLowerCase(le)!= Character.toLowerCase(ri)){
            return false;
        }

        return checkPali(s,left+1,right-1);

    }
}
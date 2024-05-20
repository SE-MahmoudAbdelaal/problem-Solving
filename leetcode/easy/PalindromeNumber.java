class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int div=1;
        int numberofpow=s.length()-2;
        int firstDigit=(int)Math.pow(div, numberofpow);
        int lastDigit=x%10;




        if (firstDigit==lastDigit) {
            return true;
            
        }
        else{
            return false;
        }
      
    }

}
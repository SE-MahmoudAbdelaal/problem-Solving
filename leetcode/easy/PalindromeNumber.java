class Solution {
    public boolean isPalindrome(int x) {

        String s=Integer.toString(x);
        int numberofpow=s.length()-1;

        int firstDigit=x/(int)Math.pow(10, numberofpow);
        int lastDigit=Math.abs(x%10);


        if (firstDigit==lastDigit) {
            return true;
            
        }
        else{
            return false;
        }
      
    }

}
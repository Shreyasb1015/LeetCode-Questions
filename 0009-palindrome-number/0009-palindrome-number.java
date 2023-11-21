class Solution {
    public boolean isPalindrome(int x) {
        //if x is less than 0 we have to return the false
        if(x<0){
            return false;

        }
            else{
            int original=x;
            int reverse=0;
            
            while(x!=0){
                int remainder=x%10;
                reverse=reverse*10+remainder;
                x=x/10;
            }

            //Check original is equal to reverse or not
            if(original==reverse){
                return true;
            }else{
            return false;
            }
        }
        
    }
}
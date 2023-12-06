class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int prevbit= n & 1;
        n=n>>1;
        
        while(n >0)
        {
            if((n & 1)!=prevbit)
            {
                prevbit= n & 1;
                n= n >>1;
            }
            else
            {
                return false;
            }
        }
        return true;
        
    }
}
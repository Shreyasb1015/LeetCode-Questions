class Solution {
    public int myAtoi(String s) {
        
        
        int n=s.length();
        long ans=0;
        if(n==0) return (int)ans;
        boolean isnegative=false;
        int index=0;
        
        while(index <n && s.charAt(index)==' ') index++;
        
        if(index < n && s.charAt(index)=='-')
        {
            isnegative=true;
            index++;
        }
        else if(index <n && s.charAt(index)=='+') index++;
        
        while(index <n && Character.isDigit(s.charAt(index)))
        {
            ans= ans*10 +(long)(Character.getNumericValue(s.charAt(index)));
            index++;
            
            if( ans > Integer.MAX_VALUE)
            {
                return isnegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        
         ans = isnegative ? -ans : ans;
         if (ans < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (ans > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }  
        
        return (int) ans;
    }
}
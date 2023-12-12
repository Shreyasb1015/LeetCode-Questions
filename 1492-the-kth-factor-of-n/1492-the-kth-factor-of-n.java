class Solution {
    public int kthFactor(int n, int k) {
        
        if(isprime(n) && k > 2) return -1;
        if(isprime(n) && k ==2) return n;
        if(isprime(n)&& k==1) return 1;

        
        int index=0;
        
        for(int i=1; i<=n;i++)
        {
            if(n%i==0) index++;
            if(index==k) return i;
            
        }
        
        return -1;
        
        
    }
    
    boolean isprime(int n)
    {
         for(int i=2;i <= Math.sqrt(n);i++){

            if(n % i ==0) return false;

        }
        return true;

    
    }
}
class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        
        return check(a,b) || check(b,a);
        
    }
    
    boolean check (String a , String b)
    {
        int left=0;
        int right=b.length()-1;
        
        while( left < right && a.charAt(left)==b.charAt(right))
        {
            left++;
            right--;
        }
        
        if(left >=right ) return true;
        
        return isPalindrome(a,left,right) || isPalindrome(b,left,right);
        
    }
    
    boolean isPalindrome(String str,int left,int right)
    {
        while(left < right)
        {
            if(str.charAt(left++)!=str.charAt(right--)) return false;
        }
        
        return true;
    }
}
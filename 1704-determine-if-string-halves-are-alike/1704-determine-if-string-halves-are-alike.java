class Solution {
    public boolean halvesAreAlike(String s) {
        
        boolean result= vowelCount(s.substring(0,s.length()/2)) == vowelCount(s.substring(s.length()/2));
        
        return result;
        
        
        
    }
    
    int vowelCount(String str)
    {
        int count=0;
        for(int i= 0;i<str.length();i++)
        {
            if("AEIOUaeiou".indexOf(str.charAt(i))!= -1)
            {
                count ++;
            }
        }
        
        return count;
        
    }
}
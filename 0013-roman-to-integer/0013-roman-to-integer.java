class Solution {
    public int romanToInt(String s) {
        
        
        int i=0;
        int ans=0;
        
        while(i <s.length())
        {
            if(s.charAt(i)=='M')
            {
                ans += 1000;
            }
            else if(i + 1 < s.length() && s.substring(i, i + 2).equals("CM"))
            {
                ans+= 900;
                i++;
            }
            else if(s.charAt(i)== 'D')
            {
                ans+= 500;
            }
            else if(i + 1 < s.length() && s.substring(i, i + 2).equals("CD"))
            {
                ans+= 400;
                i++;
            }
            else if(s.charAt(i)=='C')
            {
                ans+= 100;
            }
            else if(i + 1 < s.length() && s.substring(i, i + 2).equals("XC"))
            {
                ans+= 90;
                i++;
            }
            else if(s.charAt(i)== 'L')
            {
                ans+= 50;
            }
            else if(i + 1 < s.length() && s.substring(i, i + 2).equals("XL"))
            {
                ans+= 40;
                i++;
            }
            else if(s.charAt(i)== 'X')
            {
                ans+= 10;
            }
            else if(i + 1 < s.length() && s.substring(i, i + 2).equals("IX"))
            {
                ans+= 9;
                i++;
            }
            else if(s.charAt(i)== 'V')
            {
                ans+= 5;
            }
            else if(i + 1 < s.length() && s.substring(i, i + 2).equals("IV"))
            {
                ans+= 4;
                i++;
            }
            else
            {
                ans +=1;
            }
            i++;
        }
        return ans;
        
    }
}
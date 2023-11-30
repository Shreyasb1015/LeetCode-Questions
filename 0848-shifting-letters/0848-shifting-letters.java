class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        StringBuilder result= new StringBuilder();
        
        int x=0;
        for(int shift : shifts)
          x =(x+shift) % 26;
        
        for(int i =0; i<s.length();i++)
        {
            int index = s.charAt(i) - 'a';
            result.append((char)((index+x)% 26 +97));
            x=Math.floorMod(x-shifts[i],26);
        }
        
        return result.toString();
        
    }
    
    
}
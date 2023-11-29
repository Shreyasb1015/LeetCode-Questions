class Solution {
    public String reversePrefix(String word, char ch) {
        
        boolean isPresent = word.indexOf(ch) !=-1;
        if(!isPresent)
        {
            return word;
        }
        
        int pos=word.indexOf(ch);
        
        StringBuilder reversed = new StringBuilder(word.substring(0,pos+1));
        reversed.reverse();
        
          return reversed.toString()  + word.substring(pos+1);
        
    
        
        
    }
}
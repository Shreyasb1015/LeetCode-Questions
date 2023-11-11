class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        if(Character.compare(target,letters[letters.length-1])>=0)
        {
            return letters[0];
        }
        else{
            
            int start=0;
            int end=letters.length-1;
            
            while(start<=end)
            {
                int mid=start+(end-start)/2; 
                
                if(Character.compare(target,letters[mid])==0)
                {
                   start=mid+1;
                }
                else if(Character.compare(target,letters[mid])>0)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            
            return letters[start];
        }
        
    }
}
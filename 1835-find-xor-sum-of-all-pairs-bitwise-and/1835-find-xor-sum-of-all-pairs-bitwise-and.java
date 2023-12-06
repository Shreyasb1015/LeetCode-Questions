class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        
       
        int result1=0;
        int result2=0;
        for(int num :arr1)
        {
            result1 ^= num;
        }
        for(int num :arr2)
        {
            result2 ^= num;
        
        }
        
        return (result1 & result2);
    }
}
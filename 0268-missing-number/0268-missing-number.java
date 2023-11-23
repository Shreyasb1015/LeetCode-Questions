class Solution {
    public int missingNumber(int[] nums) {
        
        
        int n=nums.length;
        
        int totalSum= n*(n+1)/2;
        int numSum=0;
        
        for(int num :nums)
        {
            numSum += num;
        }
        if(numSum==totalSum)
        {
            return 0;
        }
        else
        {
            return (totalSum-numSum);
        }
    }
}
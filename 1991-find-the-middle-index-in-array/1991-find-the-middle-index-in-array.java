class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int sumleft=0;
        int sumright=0;
        
        for(int num :nums)
        {
            sum+=num;
        }
        
        for(int i =0;i <nums.length;i++)
        {
            sumleft += nums[i];
            sumright = sum - sumleft + nums[i];
            
            if(sumleft == sumright)
            {
                return i;
            }
        }
        return -1;
    }
        
    
}
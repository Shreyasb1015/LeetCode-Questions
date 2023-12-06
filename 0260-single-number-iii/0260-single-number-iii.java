class Solution {
    public int[] singleNumber(int[] nums) {
        
        int result=0;
        for(int num :nums) result ^=num;
        
        int rightmostSetcount=0;
        while((result & 1)==0)
        {
            rightmostSetcount++;
            result=result >>1;
        }
        
        int firstele=0;
        int secondele=0;
        for(int i=0;i<nums.length;i++)
        {
            if(((nums[i]>>rightmostSetcount)& 1)==1)
            {
                firstele ^=nums[i];
            }
            else
            {
                secondele ^=nums[i];
            }
        }
        
        int[] ans = new int[2];
        ans[0]=firstele;
        ans[1]=secondele;
        return ans;
    }
}
class Solution {
    public boolean search(int[] nums, int target) {
        
        int pivot=0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                pivot=i;
                break;
            }
        }
        
        boolean isthere=binarysearch(nums,0,pivot,target);
        
        if(isthere)
        {
            return true;
        }
        isthere=binarysearch(nums,pivot+1,nums.length-1,target);
         if(isthere)
        {
            return true;
        }
        
        return false;
        
        
        
    }
    
     boolean binarysearch(int[] nums,int start,int end,int target){
            
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                
                if(nums[mid]==target)
                {
                    return true;
                }
                else if(target>nums[mid])
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return false;
        }
}
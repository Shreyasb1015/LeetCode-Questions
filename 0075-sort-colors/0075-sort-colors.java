class Solution {
    public void sortColors(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        int ptr=0;
        
       while(ptr<=right)
        {
            if(nums[ptr]==1)
            {
                ptr++;
                
            }
            else if(nums[ptr]==0)
            {
                int temp=nums[ptr];
                nums[ptr]=nums[left];
                nums[left]=temp;
                left++;
                ptr++;
                
            }
            else
            {
                int temp=nums[ptr];
                nums[ptr]=nums[right];
                nums[right]=temp;
                right--;
                
            }
        }
        
    }
}
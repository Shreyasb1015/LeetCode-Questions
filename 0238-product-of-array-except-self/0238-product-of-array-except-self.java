class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int product =1;
        for(int i=0;i<nums.length;i++){
            int cur = nums[i];
           ans[i] = product;
           product*=cur;
        }
        product=1; 
        for(int i=nums.length-1;i>=0;i--){
            int cur = nums[i];
            ans[i]*=product;
            product*=cur;
        }
        return ans;
    }
}

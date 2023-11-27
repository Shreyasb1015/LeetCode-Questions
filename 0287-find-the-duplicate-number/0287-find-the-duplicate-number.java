class Solution {
    public int findDuplicate(int[] nums) {
        
        sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i]-1)
            {
                return nums[i];
            }
        }
        
        return -1;
    }
    static void sort(int[] arr){

        int i=0;

        while(i< arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int [] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
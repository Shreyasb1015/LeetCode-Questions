class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list= new ArrayList<Integer>();
        sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i]-1)
            {
                list.add(i+1);
            }
        }
        return list;
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
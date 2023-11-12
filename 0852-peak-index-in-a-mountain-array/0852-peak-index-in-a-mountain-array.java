class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start=0;
        int end=arr.length-1;
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
            
            if(arr[mid]>arr[mid+1])
            {
                //we are desc part of array
                //this maybe the potential ans,bt we should look at left.
                
                end=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                //we are in asc part of array
                start=mid+1;
                
            }
        }
        //in the end,start and end points to the same array location ,i.e our peak element's index.
        return start;
    }
}
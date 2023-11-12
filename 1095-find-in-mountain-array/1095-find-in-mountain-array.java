/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak=peakIndexInMountainArray(mountainArr);
        int startpos=orderAgnosticBS(mountainArr,target,0,peak);
        if(startpos!= -1)
        {
            return startpos;
        }
        else
        {
            return orderAgnosticBS(mountainArr,target,peak+1,mountainArr.length()-1);
        }
        
    }
     public int peakIndexInMountainArray(MountainArray arr) {
        
        int start=0;
        int end=arr.length()-1;
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
            
            if(arr.get(mid)>arr.get(mid+1))
            {
                //we are desc part of array
                //this maybe the potential ans,bt we should look at left.
                
                end=mid;
            }
            else if(arr.get(mid)<arr.get(mid+1))
            {
                //we are in asc part of array
                start=mid+1;
                
            }
        }
        //in the end,start and end points to the same array location ,i.e our peak element's           index.
        return start;
    }
      public int orderAgnosticBS(MountainArray arr,int target,int start,int end)
    {
       
         //find whether the array is sorted in ascending or descending

        boolean isAsc=arr.get(start)<arr.get(end);

        while(start<=end) {
          
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }

            }

        }
        return -1;
    }
}
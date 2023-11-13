class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        //start=minimum eating speed i.e 1 banana per hr
        int start = 1;
        //end is the maximum eating speed i.e maximum piles in array
        int end =  max;
    
        while(start<end){
            //Finding the middle eating speed
            int mid = start + (end-start) / 2;
            //If the speed is too slow than req hrs,updating the start
            if(hrs(mid,piles)>h){
                start = mid + 1;
          }
            else{
                //else updating the mid
                end=mid;
            }
        }
        return start;
    }


        public int hrs(long num, int[] arr){
            int total_hrs = 0;
            for(int i = 0; i < arr.length; i++){
                total_hrs += Math.ceil((double)arr[i]/num);
            }
            return total_hrs;
         }

}

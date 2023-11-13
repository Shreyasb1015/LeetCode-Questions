class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int start=0;
        int end=0;
        
        for(int i=0 ;i < weights.length;i++)
        {
            start=Math.max(start,weights[i]);
            end += weights[i];
        }
        
        while(start<end)
        {
            
            int mid= start+ (end-start)/2;
            int sum=0;
            int day_count=1;       //initial condition
            for(int weight :weights)
            {
                if(sum+weight > mid)
                {
                    sum=weight;         //if the sum of subarray is greater than mid,then we will increment day_count and store the weight in sum
                    day_count++;
                }
                else
                {
                    sum += weight;     //calculating the total weight capacity of ship 
                }
            }
            
            if(day_count > days)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        
        return end;     //condition where start=end
        
    }
}
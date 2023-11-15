class Solution {
    public int countNegatives(int[][] grid) {
        
        int rows=0;
        int cols=grid[0].length-1;
        
        int count=0;
        while(cols>=0 && rows <=(grid.length-1))
        {
            if(grid[rows][cols]< 0)
            {
                count += grid.length-rows;
                cols--;
            }
            else
            {
                rows++;
            }
        }
        return count;
        
    }
}
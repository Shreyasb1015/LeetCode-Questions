class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList();
        for(int i=left;i<=right;i++)
        {
            if (selfdivide(i))
                list.add(i);
        }
        return list;
        
    }
    
     public boolean selfdivide(int num)
     {
         int n=num;
         while(num >0)
         {
             int d=num%10;
             if(d==0 || n%d !=0)
             {
                 return false;
             }
             num /=10;
         }
         return true;
     }
}
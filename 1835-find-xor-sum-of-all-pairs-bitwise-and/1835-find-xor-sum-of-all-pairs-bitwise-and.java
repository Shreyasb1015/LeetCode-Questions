class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        
      int xor1,xor2;
      if(arr1.length==1)
      xor1=arr1[0];
      else
      {
          xor1=arr1[0]^arr1[1];
          for(int i=2;i<arr1.length;i++)
          xor1=xor1^arr1[i];
      }  
        if(arr2.length==1)
      xor2=arr2[0];
      else
      {
          xor2=arr2[0]^arr2[1];
          for(int i=2;i<arr2.length;i++)
          xor2=xor2^arr2[i];
      } 
      return (xor1&xor2); 
    }
}
        
    
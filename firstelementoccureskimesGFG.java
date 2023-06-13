
class Solution
{
    public int firstElementKTime(int[] a, int n, int k) 
    { 
      
      for(int i=0;i<n-1;i++)
      {
          int c=0;
          for(int j=i+1;j<n-1;j++)
          {
              if(a[i]==a[j]){
                  c++;
              }
          }
              if(c==k){
                  
              
                  return a[i];
              }
            return -1;     
       
   }
     return -1;
 
          }
          
    
}
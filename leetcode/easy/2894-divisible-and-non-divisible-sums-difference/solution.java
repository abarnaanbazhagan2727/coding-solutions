class Solution {
    public int differenceOfSums(int n, int m) {
        int c=0,c1=0;
        
        for(int i=0;i<=n;i++)
        {
            if(i%m==0)
            {
               c=c+i;
            }
            else{
                c1=c1+i;
            }
        }
         return c1-c;
        
    }
}
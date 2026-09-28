class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        
        int res[]=new int[nums.length+1];
        res[0]=0;
        for(int i=1;i<=nums.length;i++)
        {
            res[i]=res[i-1]+nums[i-1];
        }
        for(int j=0;j<res.length;j++)
        {
            for(int m=j+1;m<res.length;m++)
            {
                if(res[m]-res[j]==k)
                {
                    c++;
                }
            }
        }
        return c;
    }
}
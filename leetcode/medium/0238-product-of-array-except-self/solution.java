class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        result[0]=1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int prd=1;
        for(int j=0;j<n;j++)
        {
            if(i==j)
            {
                continue;
            }
            prd*=nums[j];
        }
        result[i]=prd;
        }
        return result;

        
    }
}
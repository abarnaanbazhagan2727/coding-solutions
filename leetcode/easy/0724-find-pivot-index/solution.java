class Solution {
    public int pivotIndex(int[] nums) {
        int rsum=0;
        for(int x:nums)
        {
            rsum=rsum+x;
        }
        int lsum=0;
        for(int i=0;i<nums.length;i++)
        {
            rsum=rsum-nums[i];
        
        if(lsum==rsum)
        {
            return i;
        }
        lsum=lsum+nums[i];
        
    }
    return -1;
}
}
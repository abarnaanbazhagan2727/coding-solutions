class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre= new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=nums[i]+pre[i-1];
        }
           
        for(int i=0;i<nums.length;i++)
        {
            int ls=(i==0)?0:pre[i-1];
            int rsum=pre[nums.length-1]-pre[i];
        
        if(ls==rsum)
        {
            return i;
        }}
        return -1;
        
    }
}
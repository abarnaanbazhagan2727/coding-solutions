class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int ans=-1;
        for(int x:nums)
        {
            if(h.contains(x))
            {
                return x;    
            }
            h.add(x);
        }
        return -1;
    }
}
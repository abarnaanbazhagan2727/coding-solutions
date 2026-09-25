class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        HashSet<Integer> h=new HashSet<>();
        List<Integer> al=new ArrayList<>();
        int c=0;
        for(int x:nums)
        {
            if(h.contains(x)){
            al.add(x);
            }
            h.add(x);
        }
        return al;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Boolean> h=new HashMap<>();
        List<Integer> al=new ArrayList<>();
        for(int x:nums)
        {
          h.put(x,true);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!h.containsKey(i))
            al.add(i);
        }
        return al;
        
    }
    
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m =new HashMap<>();
        int sum=0;
        int c=0;
        m.put(0,1);
        for(int x:nums)
        {
            sum+=x;
            int req = sum-k;
            if(m.containsKey(req)){
                c+=m.get(req);
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
        }
        return c;
    }
}
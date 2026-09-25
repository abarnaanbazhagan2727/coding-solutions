class Solution {
    public int findDuplicate(int[] nums) {
        int m=-1;
        HashSet<Integer> h=new HashSet<>();
        for(int x:nums){
            if(h.contains(x)){
                m=x;
            }
            h.add(x);
        }
        return m;
    }
}
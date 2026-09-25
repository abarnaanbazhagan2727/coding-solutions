class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
       
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                set.remove(nums2[i]);
                list.add(nums2[i]);
            }
            continue;
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
        
    }
}
        
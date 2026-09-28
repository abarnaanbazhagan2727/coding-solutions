class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        HashSet<Integer> h = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i = min; i <= max; i++) {
            if (!h.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
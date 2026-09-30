class Solution {
    public int minSubarray(int[] nums, int p) {

        int total = 0;

        for (int n : nums) {
            total = (total + n) % p;
        }

        int req = total;

        if (req == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {

            sum = (sum + nums[i]) % p;

            int needed = (sum - req + p) % p;

            if (map.containsKey(needed)) {
                ans = Math.min(ans, i - map.get(needed));
            }

            map.put(sum, i);
        }

        return ans == nums.length ? -1 : ans;
    }
}
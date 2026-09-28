class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, ans = 0;

        for (int n : nums) {
            sum += n;
            int r = sum % k;

            if (r < 0) r += k;

            ans += map.getOrDefault(r, 0);
            map.put(r, map.getOrDefault(r, 0) + 1);
        }

        return ans;
    }
}
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> s = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (s.containsKey(nums[i])) {

                int oldIndex = s.get(nums[i]);

                if (i - oldIndex <= k) {
                    return true;
                }
            }

            s.put(nums[i], i);
        }

        return false;
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int[] result = new int[2];

        // Count frequencies of each number
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            freq[value] = freq[value] + 1;
        }

        // Find the duplicate and missing number
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                result[0] = i; // Duplicate number
            } else if (freq[i] == 0) {
                result[1] = i; // Missing number
            }
        }

        return result;
    }
}
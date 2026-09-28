class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        result[0] = 1;

        // Prefix product
        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Suffix product
        int su = 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * su;
            su *= nums[i];
        }

        return result;
    }
}
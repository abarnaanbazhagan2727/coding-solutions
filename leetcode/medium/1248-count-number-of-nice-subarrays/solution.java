class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);

        int c = 0;
        int oddsum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0)
                oddsum++;

            if (m.containsKey(oddsum - k))
                c += m.get(oddsum - k);

            m.put(oddsum, m.getOrDefault(oddsum, 0) + 1);
        }

        return c;
    }
}